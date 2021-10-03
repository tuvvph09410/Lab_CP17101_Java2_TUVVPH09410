/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author vuvantu
 */
public class XDate {
    private static SimpleDateFormat format= new SimpleDateFormat();
    public static Date parse(String text,String pattern)throws RuntimeException{
        try {
            format.applyPattern(pattern);
            return format.parse(text);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static Date parse(String text)throws RuntimeException{
        return XDate.parse(text,"dd-MM-yyyy");
    }
}
