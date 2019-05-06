package main;

import java.util.List;

public class University
{
    private String name;
    private List<Department> departments;
    private Address address;
    private List <Student> students;
    private List <Worker> workers;
    private List<Building> buildings;

    public University(String name, List<Department> departments, Address address, List<Student> students, List<Worker> workers, List<Building> buildings)
    {
        this.name = name;
        this.departments = departments;
        this.address = address;
        this.students = students;
        this.workers = workers;
        this.buildings = buildings;
    }

    public String getName()
    {
        return name;
    }

    public List<Department> getDepartments()
    {
        return departments;
    }

    public Address getAddress()
    {
        return address;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public List<Worker> getWorkers()
    {
        return workers;
    }

    public List<Building> getBuildings()
    {
        return buildings;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDepartments(List<Department> departments)
    {
        this.departments = departments;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public void setStudents(List<Student> students)
    {
        this.students = students;
    }

    public void setWorkers(List<Worker> workers)
    {
        this.workers = workers;
    }

    public void setBuildings(List<Building> buildings)
    {
        this.buildings = buildings;
    }

    public void printInfo()
    {
        System.out.println("Nazwa uniwersytetu: "+ name);
    }
}
