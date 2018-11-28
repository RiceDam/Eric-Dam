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
public class Teacher {
    // Teacher class holds the information of each teacher
    private String tfname;
    private String tlname;
    private String subject;
    // Teacher constructor
    public Teacher(String tfname, String tlname, String subject) {
        this.tfname = tfname;
        this.tlname = tlname;
        this.subject = subject;
    }
    // Gets the teacher's name
    public String getTname() {
        return tfname + " " + tlname;
    }
    // Sets the teacher's name
    public void setTname(String tfname, String tlname) {
        this.tfname = tfname;
        this.tlname = tlname;
    }
    // Gets the subject that the teacher is teacher
    public String getSubject() {
        return subject;
    }
    // Sets the subject that the teacher is teacher
    public void setSubject(String subject) {
        this.subject = subject;
    }
    // When printing a teacher object, it prints out the name and subject instead of code
    public String toString() {
        return "Name: " + tfname + " " + tlname + "\t" + "Subject: " + subject;
    }
}
