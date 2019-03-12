public abstract class Employee {
    String name;
    int hireYear;

    Employee() {
        name = "none";
        hireYear = 0;
    }

    Employee(String name, int hireYear) {
        this.name = name;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public int getHireYear() {
        return hireYear;
    }

    public String toString() {
        return "Name: " + name + "\tHire Year: " + hireYear;
    }

    abstract double annualSalary();

    abstract double monthlySalary();
}
