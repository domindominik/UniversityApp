package main;

public class Room
{
    private boolean isFree;
    private boolean ifForStudents;
    private int quantity;
    private int number;


    public Room(boolean isFree, boolean ifForStudents, int quantity, int number)
    {
        this.isFree = isFree;
        this.ifForStudents = ifForStudents;
        this.quantity = quantity;
        this.number = number;
    }

    public boolean isFree()
    {
        return isFree;
    }

    public boolean isIfForStudents()
    {
        return ifForStudents;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public int getNumber()
    {
        return number;
    }

    public void setFree(boolean free)
    {
        isFree = free;
    }

    public void setIfForStudents(boolean ifForStudents)
    {
        this.ifForStudents = ifForStudents;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public void printInfo()
    {
        System.out.println("Jest wolna; "+ isFree +
                            "Dla studentów: "+ ifForStudents+
                            "Numer sali: " + number+
                            "Ilość miejsc: " + quantity);
    }
}
