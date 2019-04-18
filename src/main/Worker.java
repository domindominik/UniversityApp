package main;

import java.util.Date;

public class Worker extends Human
{
    private String workerType;
    private double salary;
    private Date dateStartWorking;
    private Human human;

    public Worker(String city, String street, String houseNumber, String apartmentNumber, String zipCode, Address address, String name, String surname, Date dateOfBirth, String sex, String workerType, double salary, Date dateStartWorking, Human human)
    {
        super(city, street, houseNumber, apartmentNumber, zipCode, address, name, surname, dateOfBirth, sex);
        this.workerType = workerType;
        this.salary = salary;
        this.dateStartWorking = dateStartWorking;
        this.human = human;
    }
}
