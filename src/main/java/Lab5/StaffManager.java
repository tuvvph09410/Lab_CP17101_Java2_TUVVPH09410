/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vuvantu
 */
public class StaffManager implements StaffManager_Interface {

    List<Staff> listStaff;

    public StaffManager() {
        this.listStaff = new ArrayList<>();
    }

    public StaffManager(List<Staff> listStaff) {
        this.listStaff = listStaff;
    }

    @Override
    public void add(Staff s) {
        this.listStaff.add(s);
    }

    @Override
    public void update(int position, Staff s) {
        this.listStaff.set(position, s);
    }

    @Override
    public void delete(int position) {
        this.listStaff.remove(position);
    }

    @Override
    public void setList(List<Staff> listStaff) {
        this.listStaff = listStaff;
    }

    @Override
    public List<Staff> getList() {
        return this.listStaff;
    }

    @Override
    public Staff get(int position) {
        return this.listStaff.get(position);
    }

}
