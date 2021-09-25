/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Swing;

import java.util.ArrayList;

/**
 *
 * @author vuvantu
 */
public interface QuanLySanPham_Interface {

    public void add(SanPham sanPham);

    public void update(int viTri, SanPham sanPham);

    public void delete(int viTri);

    public SanPham get(int viTri);

    public ArrayList<SanPham> getArrayList();

    public void setArrayList(ArrayList<SanPham> arrayListSP);
}
