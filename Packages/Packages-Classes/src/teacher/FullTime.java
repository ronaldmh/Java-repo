package teacher;
import person.Person;

public class FullTime extends Person{
    private int courseNumber;
    private double Salary;
    private int yearExperience;

    // 2-Constructor
    public FullTime(String name, int age, int identification, int courseNumber, double salary, int yearExperience) {
        super(name, age, identification);
        this.courseNumber = courseNumber;
        Salary = salary;
        this.yearExperience = yearExperience;
    }

    // 3-Getter and Setter
    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public int getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
    }



}
