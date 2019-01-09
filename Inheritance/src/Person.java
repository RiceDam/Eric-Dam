public class Person {
    protected int age;
    protected String gender;
    protected String fName;
    protected String lName;

    public Person() {
        this.age = 0;
        this.gender = "neutral";
        this.fName = "First";
        this.lName = "Last";
    }

    public Person(int age, String gender, String fName, String lName) {
        this.age = age;
        this.gender = gender;
        this.fName = fName;
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    public String speak() {
        return age + " " + gender + " " + fName + " " + lName;
    }
    public String getName() {
        return fName + "\t" +lName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
