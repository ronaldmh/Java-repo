package student;
import person.Person;

public class International extends Person {
    private String country;
    private boolean scholarship;
    private String programName;

    //2-Constructor
    public International(String name, int age, int identification, String country, boolean scholarship) {
        super(name, age, identification);
        this.country = country;
        this.scholarship = scholarship;
        this.programName = programName;
    }

    //3-Getter and Setter
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isScholarship() {
        return scholarship;
    }

    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }


}
