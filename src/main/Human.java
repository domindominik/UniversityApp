package main;

import java.util.Date;

public class Human
{
    private Address address;
    private String name;
    private String surname;
    private Date dateOfBirth;
    private String sex;

    public Human(Address address, String name, String surname, Date dateOfBirth, String sex)
    {

        this.address = address;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }
}
