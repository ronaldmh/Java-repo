package main;
import student.International;
import student.Local;
import teacher.FullTime;
import teacher.PartTime;
import person.Address;

public class Main {
    public static void main(String[] args){

        International student1 = new International("Luciana",5,1317,"Canada",true);
        International student2 = new International("JuanJo",4,1118,"Colombia",true);
        Address address1 = new Address();
        address1.setCity("Montreal");
        address1.setPostalCode("H4");

        Local student3 = new Local();
        student3.setProvince("Alberta");
        student3.setProgramName("Computer sciences");
        student3.setName("Edgar Herrera");

        FullTime teacher1 = new FullTime("Tian Lee", 42, 1245, 2,4500,20);
        PartTime teacher2 = new PartTime("Daniel G.", 45, 2556, 27.5,25);

        if(student1.isScholarship()){
        System.out.println(student1.getName() + " lives at " + student1.getCountry());}

        System.out.println(student1.getName() + " is " + student1.getAge() + " years old");
        System.out.println(student2.getName() + " is a local student");
        System.out.println(teacher1.getName() + " is a full-time teacher with a salary of $" + teacher1.getSalary());
        System.out.println(teacher2.getName() + " is a part-time teacher with an hourly rate of $" + teacher2.getHourlyRates());
    }

}
