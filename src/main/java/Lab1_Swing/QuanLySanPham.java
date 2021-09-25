/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Swing;

import Lab1.QLSanPhamInterface;
import java.util.ArrayList;

/**
 *
 * @author vuvantu
 */
public class QuanLySanPham implements QuanLySanPham_Interface {

    private ArrayList<SanPham> arrayListSP;

    public QuanLySanPham() {
        this.arrayListSP=new ArrayList<>();
    }

    public QuanLySanPham(ArrayList<SanPham> arrayListSP) {
        this.arrayListSP = arrayListSP;
    }
    

    @Override
    public void add(SanPham sanPham) {
        this.arrayListSP.add(sanPham);
    }

    @Override
    public void update(int viTri, SanPham sanPham) {
        this.arrayListSP.set(viTri,sanPham);
    }

    @Override
    public void delete(int viTri) {
        this.arrayListSP.remove(viTri);
    }

    @Override
    public SanPham get(int viTri) {
        return this.arrayListSP.get(viTri);
    }

    @Override
    public ArrayList<SanPham> getArrayList() {
        return this.arrayListSP;
    }

    @Override
    public void setArrayList(ArrayList<SanPham> arrayListSP) {
        this.arrayListSP=arrayListSP;
    }

}
