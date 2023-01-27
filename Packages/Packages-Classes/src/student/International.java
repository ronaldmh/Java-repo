package student;
import person.Person;

public class International extends Person {
    private String country;

    // 2 - Constructor
    public International(String name, int age, int identification, String country) {
        super(name, age, identification);
        this.country = country;
    }

    // Getter and Setter
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



}
