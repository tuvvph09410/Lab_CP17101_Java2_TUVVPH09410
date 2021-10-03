/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.List;

/**
 *
 * @author vuvantu
 */
public interface StudentManager_Interface {

    public void add(Student s);

    public void update(int position, Student s);

    public void delete(int position);

    public void setList(List<Student> listStudent);

    public Student get(int position);

    public List<Student> getList();
    
    public void arrangePoints();
    
    public void arrangeName();
}
