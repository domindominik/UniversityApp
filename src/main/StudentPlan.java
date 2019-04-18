package main;

import java.util.List;

public class StudentPlan
{
    private List<Lesson> monday;
    private List<Lesson> tusday;
    private List<Lesson> wednesday;
    private List<Lesson> thursday;
    private List<Lesson> friday;

    public StudentPlan(List<Lesson> monday, List<Lesson> tusday, List<Lesson> wednesday, List<Lesson> thursday, List<Lesson> friday)
    {
        this.monday = monday;
        this.tusday = tusday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
    }

    public List<Lesson> getMonday()
    {
        return monday;
    }

    public void setMonday(List<Lesson> monday)
    {
        this.monday = monday;
    }

    public List<Lesson> getTusday()
    {
        return tusday;
    }

    public void setTusday(List<Lesson> tusday)
    {
        this.tusday = tusday;
    }

    public List<Lesson> getWednesday() {
        return wednesday;
    }

    public void setWednesday(List<Lesson> wednesday)
    {
        this.wednesday = wednesday;
    }

    public List<Lesson> getThursday()
    {
        return thursday;
    }

    public void setThursday(List<Lesson> thursday)
    {
        this.thursday = thursday;
    }

    public List<Lesson> getFriday()
    {
        return friday;
    }

    public void setFriday(List<Lesson> friday)
    {
        this.friday = friday;
    }
}
