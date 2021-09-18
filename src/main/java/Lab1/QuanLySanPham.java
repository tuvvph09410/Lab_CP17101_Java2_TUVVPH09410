/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.ArrayList;

/**
 *
 * @author vuvantu
 */
public class QuanLySanPham implements QLSanPhamInterface,DAOInterface {

    private KeyBoard keyBoard ;
    private ArrayList<Product> list;
    private String name;
    private Double price;
    private int n;

    public QuanLySanPham() {
        this.list=new ArrayList<>();
    }

    public QuanLySanPham(ArrayList<Product> list, String name, Double price, int n) {
        this.list = list;
        this.name = name;
        this.price = price;
        this.n = n;
    }

    @Override
    public void nhap() {

        this.n = KeyBoard.reInt("- Nhập số lượng sản phẩm: ");
        for (int i = 0; i < n; i++) {
            System.out.println("----- Sản Phẩm Thứ: " + (i + 1) + "-----");
            this.name = KeyBoard.reString("+ Nhập vào tên của sản phẩm: ");
            this.price = KeyBoard.reDouble("+ Nhập vào giá của sản phẩm: ");
            Product p = new Product(this.name, this.price);
            list.add(p);
        }
    }

    @Override
    public void Xuat() {
        System.out.println("\r\r+--------------- Xuất Danh Sách Sản Phẩm ---------------+");
        System.out.printf("\r %-20s %-10s %-10s\n", "Tên Sản Phẩm", "Giá", "Thuế Nhập Khẩu");
        for (int i = 0; i < this.list.size(); i++) {
            this.list.get(i).getInfor();
        }
    }

    @Override
    public void insert(Product p) {
        this.list.add(p);
        System.out.println("Thêm Thành Công");
    }

    @Override
    public void update(int viTri, Product p) {
        this.list.set(viTri, p);
        System.out.println("Sửa Thành Công");
    }

    @Override
    public void delete(int viTri, Product p) {
        this.list.remove(viTri);
        System.out.println("Xoá Thành Công");
    }

    @Override
    public Product select(int viTri) {
            return this.list.get(viTri);
    }

}
