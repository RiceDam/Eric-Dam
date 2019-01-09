import java.util.ArrayList;

public class Teacher extends Person {
    static int eID= 1;
    int tempID;
    ArrayList<Course> taught = new ArrayList<>();

    Teacher(int age, String gender, String fName, String lName) {
        super(age, gender, fName, lName);
        this.tempID = eID;
        eID++;
    }

    public int geteID() {
        return tempID;
    }

    public void tList() {
        for(Course c: taught) {
            System.out.println(c);
        }
    }

    public void addTCourse(Course c) {
        taught.add(c);
    }

    public void removeTCourse(Course c) {
        taught.remove(c);
    }
}
