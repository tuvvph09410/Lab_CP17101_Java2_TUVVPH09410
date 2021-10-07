/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.List;

/**
 *
 * @author vuvantu
 */
public interface StaffManager_Interface {

    public void add(Staff s);

    public void update(int position, Staff s);

    public void delete(int position);

    public void setList(List<Staff> list);

    public List<Staff> getList();

    public Staff get(int position);

}
