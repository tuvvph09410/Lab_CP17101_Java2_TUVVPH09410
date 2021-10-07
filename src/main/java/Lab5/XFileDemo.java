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
public class XFileDemo {

    public static void main(String[] args) {
        String path = "student.txt";
        List<Student> listStudent = new ArrayList<>();

        listStudent.add(new Student("Tú", 10.0, "CNTT"));
        listStudent.add(new Student("Hà", 8.5, "Marketing"));
        listStudent.add(new Student("Lý", 5.6, "AI"));

        XFile.writeObject(path, listStudent);

        List<Student> listStudents = (List<Student>) XFile.readObject(path);
        
        for (Student sv : listStudent) {
            System.out.println(">Họ và tên: " + sv.getName());
        }
    }
}
