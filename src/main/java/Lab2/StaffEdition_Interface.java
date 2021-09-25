/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.util.ArrayList;

/**
 *
 * @author vuvantu
 */
public interface StaffEdition_Interface {

    public void add(Staff s);

    public void update(int position, Staff s);

    public void delete(int position);

    public Staff get(int position);

    public ArrayList<Staff> getArrayList();

    public void setArrayList(ArrayList<Staff> arrayList);
}
