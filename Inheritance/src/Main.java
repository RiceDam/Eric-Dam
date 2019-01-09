public class Main {
    public static void main(String[] args) {
        Teacher tim = new Teacher(30,"male","Tim","Tan");
        Student huy = new Student(5,"something","Huy","Lam");
        Student eric = new Student(16, "male", "eric", "dam");
        Course c = new Course("Math", 0);
        Course e = new Course("English", 12);

        tim.addTCourse(c);
        tim.addTCourse(e);
        tim.removeTCourse(c);
        tim.tList();
        System.out.println(tim.getName());
        System.out.println(tim.geteID());
        System.out.println(tim.speak());

        eric.addSCourse(c);
        eric.addSCourse(e);
        eric.removeSCourse(e);
        eric.sList();
        System.out.println(eric.getName());
        System.out.println(eric.getsID());
        System.out.println(eric.speak());
    }
}
