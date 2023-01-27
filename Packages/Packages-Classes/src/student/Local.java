package student;
import person.Person;

public class Local extends Person{
    private String province;

    // 2 - Constructor
    public Local(String name, int age, int identification, String province) {
        super(name, age, identification);
        this.province = province;
    }

    // Getter and Setter

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
