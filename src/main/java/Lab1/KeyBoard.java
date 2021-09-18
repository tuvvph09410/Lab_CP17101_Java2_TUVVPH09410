/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author vuvantu
 */
public class KeyBoard {

    static Scanner s = new Scanner(System.in);

    public static String reString(String string) {
        System.out.println(string);
        String stri = s.nextLine();
        return stri;
    }

    public static Double reDouble(String string) {
        System.out.println(string);
        Double dble = Double.parseDouble(s.nextLine());
        return dble;
    }

    public static int reInt(String string) {
        System.out.println(string);
        int i = Integer.parseInt(s.nextLine());
        return i;
    }
}
