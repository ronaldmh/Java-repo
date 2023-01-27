package teacher;
import person.Person;

public class PartTime extends Person {
    private double hourlyRates;
    private int hoursWeek;

    //2-Constructor
    public PartTime(String name, int age, int identification, double hourlyRates, int hoursWeek) {
        super(name, age, identification);
        this.hourlyRates = hourlyRates;
        this.hoursWeek = hoursWeek;
    }

    //3-Getter and Setter
    public double getHourlyRates() {
        return hourlyRates;
    }

    public void setHourlyRates(double hourlyRates) {
        this.hourlyRates = hourlyRates;
    }

    public int getHoursWeek() {
        return hoursWeek;
    }

    public void setHoursWeek(int hoursWeek) {
        this.hoursWeek = hoursWeek;
    }
}
