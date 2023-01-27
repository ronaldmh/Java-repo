package student;
import person.Person;

public class Local extends Person{
    private String province;
    private String programName;

    //Default Constructor

    public Local (){};

    //2-Constructor
    public Local(String name, int age, int identification, String province) {
        super(name, age, identification);
        this.province = province;
        this.programName = programName;
    }

    //3-Getter and Setter
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }
}
