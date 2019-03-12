public class PartTime extends HourlyEmployee {
    boolean hasBenefits;

    PartTime() {
        name = "none";
        hireYear = 0;
        hoursPerWeek = 0;
        hourlyWage = 0;
    }
    PartTime(String name, int hireYear, int hoursPerWeek, int hourlyWage) {
        super();
    }

    boolean hasBenefits() {
        if (hoursPerWeek >= 30) {
            return true;
        }
        else {
            return false;
        }
    }


    double annualSalary() {
        return hoursPerWeek*hourlyWage*52;
    }

    double monthlySalary() {
        return hoursPerWeek*hourlyWage*4;
    }
}
