public class Course {
    protected String name;
    protected int grade;

    Course() {
        this.name = "Course";
        this.grade = 0;
    }

    Course(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return name + "\t" + grade;
    }
}
