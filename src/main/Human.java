package main;

import enums.Sex;

import java.util.Date;

public class Human
{
    private Address address;
    private String name;
    private String surname;
    private Date dateOfBirth;
    private Sex sex;

    public Human(Address address, String name, String surname, Date dateOfBirth, Sex sex)
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

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public Sex getSex()
    {
        return sex;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setDateOfBirth(Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSex(Sex sex)
    {
        this.sex = sex;
    }

    /*public void printInfo()
    {
        System.out.println("Imię: " + name +
                            ", Nazwisko: " + surname +
                            ", Data urodzenia: " + dateOfBirth +
                            ", Płeć: " + sex +
                            ", Miasto: " + address.getCity() +
                            ", Ulica: " + address.getStreet() +
                            ", Numer domu: " + address.getHouseNumber() +
                            ", Numer lokalu: " + address.getApartmentNumber() +
                            ", Kod pocztowy: " + address.getZipCode() +
                            "\n\n");
    }*/
}
