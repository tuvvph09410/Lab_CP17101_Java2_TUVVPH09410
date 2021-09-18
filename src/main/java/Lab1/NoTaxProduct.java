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
public class NoTaxProduct extends Product {

    @Override
    public double getImproTax() {
        return 0;
    }
    
}
