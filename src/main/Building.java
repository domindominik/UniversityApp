package main;

import java.util.List;

public class Building
{
    private List <Room> rooms;
    private String name;
    private Address address;

    public Building(List<Room> rooms, String name, Address address)
    {
        this.rooms = rooms;
        this.name = name;
        this.address = address;
    }

    public List<Room> getRooms()
    {
        return rooms;
    }

    public String getName()
    {
        return name;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setRooms(List<Room> rooms)
    {
        this.rooms = rooms;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public void printInfo()
    {
        System.out.println("Nazwa budynku: " + name +
                ", Miasto: " + address.getCity() +
                ", Ulica: " + address.getStreet() +
                ", Numer budynku: " + address.getHouseNumber() +
                ", Kod pocztowy: " + address.getZipCode() +
                ", Sala: " + rooms +
                "\n\n");
    }
}
