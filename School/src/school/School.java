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
import java.util.ArrayList;
public class School {
    // School class holds the ArrayList for teachers and students and holds its own information for the school
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private String name;
    private String address;
    private String phone;
    // Constructor for school
    public School (String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    // Getting the name of the school
    public String getName() {
        return this.name;
    }
    // Setting the name of the school
    public void setName(String name) {
        this.name = name;
    }
    // Gets the address of the school
    public String getAddress() {
        return this.address;
    }
    // Sets the address of the school
    public void setAddress(String address) {
        this.address = address;
    }
    // Gets the phone of the school
    public String getPhone() {
        return this.phone;
    }
    // Sets the phone for the school
    public void setPhone(String phone) {
        this.phone = phone;
    }
    // Prints out the list of teachers
    public void getTeachers() {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i));
        }
    }
    // Adds a teacher to the list
    public void addTeacher(Teacher t) {
        teachers.add(t);
    }
    // Prints out the list of students
    public void getStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
    // Adds a student to the list
    public void addStudent(Student s) {
        students.add(s);
    }
    // Deletes a teacher from the list
    public void deleteTeacher(Teacher t) {
        teachers.remove(t);
    }
    // Deletes a student from the list
    public void deleteStudent(Student s) {
        students.remove(s);
    }

}
