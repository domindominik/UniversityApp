package main;

public class Subject
{
    private Worker lecturer;
    private String name;
    private int points;

    public Subject(Worker lecturer, String name, int points)
    {
        this.lecturer = lecturer;
        this.name = name;
        this.points = points;
    }

    public Worker getLecturer()
    {
        return lecturer;
    }

    public String getName()
    {
        return name;
    }

    public int getPoints()
    {
        return points;
    }

    public void setLecturer(Worker lecturer)
    {
        this.lecturer = lecturer;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }
}
