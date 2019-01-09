import java.util.ArrayList;
import java.util.Random;

public class Student extends Person {
    int sID;
    Random rand = new Random();
    ArrayList<Course> learn = new ArrayList<>();

    Student(int age, String gender, String fName, String lName) {
        super(age,gender,fName,lName);
        this.sID = rand.nextInt(10000) + 1;
    }

    public int getsID() {
        return sID;
    }

    public void sList() {
        for(Course c: learn) {
            System.out.println(c);
        }
    }

    public void addSCourse(Course c) {
        learn.add(c);
    }

    public void removeSCourse(Course c) {
        learn.remove(c);
    }
}
