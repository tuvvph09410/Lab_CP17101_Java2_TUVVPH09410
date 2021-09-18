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
public class Product {
    private String name;
    private double price;
   
    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void getInfor(){
        System.out.printf("\r %-20S %-10s %-10s \n",name,price,getImproTax());
    }
    public double getImproTax(){
        double thueNhapKhau=this.price * 0.1;
        return thueNhapKhau;
    }

 
}
