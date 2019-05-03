package main;

public class Room
{
    private boolean isFree;
    private boolean ifForStudents;
    private int quantityOfSets;
    private int number;


    public Room(boolean isFree, boolean ifForStudents, int quantityOfSets, int number)
    {
        this.isFree = isFree;
        this.ifForStudents = ifForStudents;
        this.quantityOfSets = quantityOfSets;
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

    public int getQuantityOfSets()
    {
        return quantityOfSets;
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

    public void setQuantityOfSets(int quantityOfSets)
    {
        this.quantityOfSets = quantityOfSets;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public void printInfo()
    {
        System.out.println("Jest wolna: "+ isFree +
                            ", Dla studentow: "+ ifForStudents+
                            ", Numer sali: " + number+
                            ", Ilość miejsc: " + quantityOfSets +
                            "\n\n");
    }
}
