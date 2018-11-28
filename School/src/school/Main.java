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
public class Main {
    public static void main(String[] args) {
        School yes = new School("Windermere", "3155 E. 27th Ave.", "(604) 713-8180");
        Student s1 = new Student("a", "b", 1);
        Student s2 = new Student("c", "d", 2);
        Student s3 = new Student("e", "f", 3);
        Student s4 = new Student("g", "h", 4);
        Student s5 = new Student("i", "j", 5);
        Student s6 = new Student("k", "l", 6);
        Student s7 = new Student("m", "n", 7);
        Student s8 = new Student("o", "p", 8);
        Student s9 = new Student("q", "r", 9);
        Student s10 = new Student("s", "t", 10);
        yes.addStudent(s1);
        yes.addStudent(s2);
        yes.addStudent(s3);
        yes.addStudent(s4);
        yes.addStudent(s5);
        yes.addStudent(s6);
        yes.addStudent(s7);
        yes.addStudent(s8);
        yes.addStudent(s9);
        yes.addStudent(s10);
        Teacher t1 = new Teacher("Bob", "Dylan", "Math");
        Teacher t2 = new Teacher("Dylan", "Bob", "Science");
        Teacher t3 = new Teacher("Tim", "Tan", "IT 11");
        yes.addTeacher(t1);
        yes.addTeacher(t2);
        yes.addTeacher(t3);
        yes.getTeachers();
        yes.getStudents();
        yes.deleteStudent(s2);
        yes.deleteStudent(s3);
        yes.deleteTeacher(t2);
        yes.getTeachers();
        yes.getStudents();
    }
}
