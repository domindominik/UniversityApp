package main;

import java.util.Date;
import java.util.List;

public class Student extends Human
{
    private String department;
    private double tuition;
    private boolean isStuding;
    private List <StudentPlan> studentPlans;
    private Index index;

    public Student(Address address, String name, String surname, Date dateOfBirth, String sex, String department, double tuition, boolean isStuding, List<StudentPlan> studentPlans, Index index)
    {
        super(address, name, surname, dateOfBirth, sex);
        this.department = department;
        this.tuition = tuition;
        this.isStuding = isStuding;
        this.studentPlans = studentPlans;
        this.index = index;
    }
}
