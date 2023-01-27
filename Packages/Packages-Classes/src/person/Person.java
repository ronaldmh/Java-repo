package person;

// 1 - Definition Super Class person
public class Person {
    private String name;
    private int age;
    private int identification;

    // 2 - Full Constructor
    public Person(String name, int age, int identification) {
        this.name = name;
        this.age = age;
        this.identification = identification;
    }

    // 3 - Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }




}
