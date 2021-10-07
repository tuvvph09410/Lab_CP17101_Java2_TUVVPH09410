/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.io.Serializable;

/**
 *
 * @author vuvantu
 */
public class Student implements Serializable{

    private String name;
    private Double mark;
    private String majok;

    public Student() {
    }

    public Student(String name, Double mark, String majok) {
        this.name = name;
        this.mark = mark;
        this.majok = majok;
    }

    public String getName() {
        return name;
    }

    public Double getMark() {
        return mark;
    }

    public String getMajok() {
        return majok;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public void setMajok(String majok) {
        this.majok = majok;
    }

    public String getGrade() {
        if (this.mark < 3) {
            return "Kém";
        }
        if (this.mark < 5) {
            return "Yếu";
        }
        if (this.mark < 6.5) {
            return "Trung bình";
        }
        if (this.mark < 7.5) {
            return "Khá";
        }
        if (this.mark < 9) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }

    public boolean isBonus() {
        return this.mark >= 7.5;
    }

}
