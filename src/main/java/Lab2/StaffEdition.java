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
public class StaffEdition implements StaffEdition_Interface {

    private ArrayList<Staff> arrayList;

    public StaffEdition() {
        this.arrayList = new ArrayList<>();
    }

    public StaffEdition(ArrayList<Staff> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public void add(Staff s) {
        this.arrayList.add(s);
    }

    @Override
    public void update(int position, Staff s) {
        this.arrayList.set(position, s);
    }

    @Override
    public void delete(int position) {
        this.arrayList.remove(position);
    }

    @Override
    public Staff get(int position) {
        return this.arrayList.get(position);
    }

    @Override
    public ArrayList<Staff> getArrayList() {
        return this.arrayList;
    }

    @Override
    public void setArrayList(ArrayList<Staff> arrayList) {
        this.arrayList=arrayList;
    }

}
