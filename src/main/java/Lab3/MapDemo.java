/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author vuvantu
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();
        Student sv = new Student("Tuấn", 7.0, "Công Nghệ Thông Tin");
        map.put(sv.getName(), sv);
        Set<String> keys = map.keySet();
        for (String name : keys) {
            Student sv1 = map.get(name);
            System.out.println("> Họ Và Tên: " + sv1.getName());
            System.out.println("> Họ Và Tên: " + sv1.getGrade());
        }

    }
}
