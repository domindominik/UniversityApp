package main;

import java.util.Date;
import java.util.List;

public class Student extends Human
{
    //private Human human;
    private String department;
    private double tuition;
    private boolean isStuding;
    private List <StudentPlan> studentPlans;

    public Student(String city, String street, String houseNumber, String apartmentNumber, String zipCode, Address address, String name, String surname, Date dateOfBirth, String sex, String department, double tuition, boolean isStuding, List<StudentPlan> studentPlans)
    {
        super(address, name, surname, dateOfBirth, sex);
        this.department = department;
        this.tuition = tuition;
        this.isStuding = isStuding;
        this.studentPlans = studentPlans;
    }
}
