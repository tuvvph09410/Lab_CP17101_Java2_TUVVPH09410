/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Swing;

/**
 *
 * @author vuvantu
 */
public class SanPham {

    private String tenSP;
    private Double giaSP;
    private int slSP;
    private String loaiSP;

    public SanPham() {
    }

    public SanPham(String tenSP, Double giaSP, int slSP, String loaiSP) {
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.slSP = slSP;
        this.loaiSP = loaiSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public Double getGiaSP() {
        return giaSP;
    }

    public int getSlSP() {
        return slSP;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setGiaSP(Double giaSP) {
        this.giaSP = giaSP;
    }

    public void setSlSP(int slSP) {
        this.slSP = slSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public Double getTongTien() {
        return this.giaSP * this.slSP;
    }
}
