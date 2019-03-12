public class FullTime extends HourlyEmployee {
    boolean hasBenefits;

    FullTime() {
        name = "none";
        hireYear = 0;
        hoursPerWeek = 0;
        hourlyWage = 0;
    }

    FullTime(String name, int hireYear, int hoursPerWeek, int hourlyWage ) {
        super();
    }

    boolean hasBenefits() {
        return true;
    }

    double annualSalary() {
        return hoursPerWeek*hourlyWage*52;
    }

    double monthlySalary() {
        return hoursPerWeek*hourlyWage*4;
    }
}
