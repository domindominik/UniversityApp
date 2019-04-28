package main;

import java.util.Date;

public class Human
{
    private Address address;
    private String name;
    private String surname;
    private Date dateOfBirth;
    private char sex;

    public Human(Address address, String name, String surname, Date dateOfBirth, char sex)
    {
        this.address = address;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public char getSex()
    {
        return sex;
    }

    public void setSex(char sex)
    {
        this.sex = sex;
    }

    public void printInfo()
    {
        System.out.println("Imię: " + name +
                            "Nazzwisko: " + surname +
                            "Data urodzenia: " + dateOfBirth +
                            "Płeć: " + sex +
                            "Miasto: " + address.getCity() +
                            "Ulica: " + address.getStreet() +
                            "Numer domu: " + address.getHouseNumber() +
                            "Numer lokalu: " + address.getApartmentNumber() +
                            "Kod pocztowy: " + address.getZipCode());
    }
}
