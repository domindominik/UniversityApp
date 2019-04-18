package main;

import java.util.List;

public class Building extends Room
{
    private List <Room> rooms;

    private Building(Room room, boolean ifForStudents, int quantity, int number)
    {
        super(ifForStudents, quantity, number);
    }

    public List<Room> getRooms()
    {
        return rooms;
    }

    public void setRooms(List<Room> rooms)
    {
        this.rooms = rooms;
    }
}
