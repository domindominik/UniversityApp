package main;

import java.util.List;

public class Building extends Room
{
    private List <Room> rooms;

    public Building(boolean isFree, boolean ifForStudents, int quantity, int number, List<Room> rooms)
    {
        super(isFree, ifForStudents, quantity, number);
        this.rooms = rooms;
    }
}
