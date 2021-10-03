/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author vuvantu
 */
public class StudentManager implements StudentManager_Interface {

    private List<Student> listStudent;

    public StudentManager(List<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public StudentManager() {
        this.listStudent = new ArrayList<>();
    }

    @Override
    public void add(Student s) {
        this.listStudent.add(s);
    }

    @Override
    public void update(int position, Student s) {
        this.listStudent.set(position, s);
    }

    @Override
    public void delete(int position) {
        this.listStudent.remove(position);
    }

    @Override
    public void setList(List<Student> listStudent) {
        this.listStudent = listStudent;
    }

    @Override
    public Student get(int position) {
        return this.listStudent.get(position);
    }

    @Override
    public List<Student> getList() {
        return this.listStudent;
    }

    @Override
    public void arrangePoints() {
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                Double d1 = o1.getPoints();
                Double d2 = o2.getPoints();
                return d1.compareTo(d2);
            }

        };
        Collections.sort(getList(), comparator);
    }

    @Override
    public void arrangeName() {
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }

        };
        Collections.sort(getList(), comparator);
    }

}
