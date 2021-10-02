/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author vuvantu
 */
public class Student {

    private String name;
    private Double points;
    private String majors;

    public Student() {
    }

    public Student(String name, Double points, String majors) {
        this.name = name;
        this.points = points;
        this.majors = majors;
    }

    public String getName() {
        return name;
    }

    public Double getPoints() {
        return points;
    }

    public String getMajors() {
        return majors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getGrade() {
        if (this.points < 3) {
            return "Kém";
        }
        if (this.points < 5) {
            return "Yếu";
        }
        if (this.points < 6.5) {
            return "Trung bình";
        }
        if (this.points < 7.5) {
            return "Khá";
        }
        if (this.points < 9) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }
    public boolean isBonus(){
        return this.points >= 7.5;
    }
}
