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
public interface DAOInterface {

    public void insert(Product p);

    public void update(int viTri, Product p);

    public void delete(int viTri, Product p);

    public Product select(int viTri);

}
