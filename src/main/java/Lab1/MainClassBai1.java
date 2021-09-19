/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author vuvantu
 */
public class MainClassBai1 {

    static KeyBoard keyBoard ;
    static QuanLySanPham quanLySanPham = new QuanLySanPham();

    public static void main(String[] args) {
        while (true) {
            menu();
            int chon = keyBoard.reInt(" Chọn chức năng từ [1-2] là:");
            switch (chon) {
                case 1:
                    quanLySanPham.nhap();
                    break;
                case 2:
                    quanLySanPham.Xuat();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("1.Nhập danh sách sản phẩm");
        System.out.println("2.Xuất danh sách sản phẩm");
        System.out.println("0.Thoát");
    }

}
