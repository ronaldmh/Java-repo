package teacher;
import person.Person;

public class FullTime extends Person{
    private int numberOfCourses;
    private double Salary;
    private int yearOfExperience;

    // 2-Constructor
    public FullTime(String name, int age, int identification, int courseNumber, double salary, int yearExperience) {
        super(name, age, identification);
        this.numberOfCourses = courseNumber;
        Salary = salary;
        this.yearOfExperience = yearExperience;
    }

    // 3-Getter and Setter
    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }



}
