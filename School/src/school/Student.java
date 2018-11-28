/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author ericdam1
 */
import java.util.Random;
public class Student {
    //Student Class holds the information for each student
    private String sfname;
    private String slname;
    private int grade;
    private int id;
    Random rand = new Random();
    // Student Constructor
    public Student(String sfname, String slname, int grade) {
        this.sfname = sfname;
        this.slname = slname;
        this.grade = grade;
        // Creates a random id for each student
        this.id = rand.nextInt(2001);
    }
    // When printing Student object, it prints out name, grade and id instead of code
    public String toString() {
        return "Name: " + sfname + " " + slname + "\t" + "Grade: " + String.valueOf(grade) + "\t" + "ID: " + id;
    }
    // Sets the student's name
    public void setSname(String sfname, String slname) {
        this.sfname = sfname;
        this.slname = slname;
    }
    // Gets the student's name
    public String getSname() {
        return sfname + " " + slname;
    }
    // Sets the student's grade
    public void setGrade(int grade) {
        this.grade = grade;
        if (this.grade > 12) {
            this.grade = 12;
        }
        if (this.grade < 0) {
            this.grade = 0;
        }
    }
    // Gets the grade of the student
    public int getGrade() {
        return grade;
    }
    // Gets the student's id number
    public int getId() {
        return id;
    }
    // Sets the student's id number
    public void setId(int id) {
        this.id = id;
    }
}
