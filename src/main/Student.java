package main;

import enums.Department;
import enums.Sex;

import java.util.Date;
import java.util.List;

public class Student extends Human
{
    private Department department;
    private double tuition;
    private boolean isStuding;
    private List <StudentPlan> studentPlans;
    private Index index;

    public Student(Address address, String name, String surname, Date dateOfBirth, Sex sex, Department department, double tuition, boolean isStuding, List<StudentPlan> studentPlans, Index index)
    {
        super(address, name, surname, dateOfBirth, sex);
        this.department = department;
        this.tuition = tuition;
        this.isStuding = isStuding;
        this.studentPlans = studentPlans;
        this.index = index;
    }

    public Department getDepartment()
    {
        return department;
    }

    public double getTuition()
    {
        return tuition;
    }

    public boolean isStuding()
    {
        return isStuding;
    }

    public List<StudentPlan> getStudentPlans()
    {
        return studentPlans;
    }

    public Index getIndex()
    {
        return index;
    }

    public void setDepartment(Department department)
    {
        this.department = department;
    }

    public void setTuition(double tuition)
    {
        this.tuition = tuition;
    }

    public void setStuding(boolean studing)
    {
        isStuding = studing;
    }

    public void setStudentPlans(List<StudentPlan> studentPlans)
    {
        this.studentPlans = studentPlans;
    }

    public void setIndex(Index index)
    {
        this.index = index;
    }

    public void printInfo()
    {
        System.out.println("Nazwa kierunku: " + department +
                ", Wysokość czesnego: " + tuition +
                ", Student aktywny: " + isStuding +
                ", Plan zajęć: " + studentPlans +
                ", Zdobyte zaliczenia: " + index +
                ", Adres słuchacza: " + getAddress() +
                ", Imię studenta: " + getName() +
                ", Nazwisko studenta" + getSurname() +
                ", Data urodzenia: " + getDateOfBirth() +
                "\n\n");
    }

}
