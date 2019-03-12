public abstract class HourlyEmployee extends Employee {
    double hoursPerWeek;
    double hourlyWage;
    boolean hasBenefits;

    HourlyEmployee() {
        super();
        hourlyWage = 0;
        hoursPerWeek = 0;
    }

    HourlyEmployee(String name, int hireYear, int hoursPerWeek, int hourlyWage) {
        super(name,hireYear);
        this.hoursPerWeek = hoursPerWeek;
        this.hourlyWage = hourlyWage;
    }

    abstract boolean hasBenefits();
}
