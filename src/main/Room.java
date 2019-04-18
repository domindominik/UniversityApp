package main;

public class Room
{
    private boolean ifForStudents;
    private int quantity;
    private int number;

    public Room(boolean ifForStudents, int quantity, int number)
    {
        this.ifForStudents = ifForStudents;
        this.quantity = quantity;
        this.number = number;
    }

    public boolean isIfForStudents()
    {
        return ifForStudents;
    }

    public void setIfForStudents(boolean ifForStudents)
    {
        this.ifForStudents = ifForStudents;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }
}
