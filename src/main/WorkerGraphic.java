package main;

import java.util.Date;
import java.util.List;

public class WorkerGraphic
{
    private Room room;
    private Date startHour;
    private List<Student> students;
    private Subject subject;

    public WorkerGraphic(Room room, Date startHour, List<Student> students, Subject subject)
    {
        this.room = room;
        this.startHour = startHour;
        this.students = students;
        this.subject = subject;
    }

    public Room getRoom()
    {
        return room;
    }

    public Date getStartHour()
    {
        return startHour;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public Subject getSubject()
    {
        return subject;
    }

    public void setRoom(Room room)
    {
        this.room = room;
    }

    public void setStartHour(Date startHour)
    {
        this.startHour = startHour;
    }

    public void setStudents(List<Student> students)
    {
        this.students = students;
    }

    public void setSubject(Subject subject)
    {
        this.subject = subject;
    }

}
