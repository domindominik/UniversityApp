package main;

import enums.Subjects;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Lesson
{
    private Subjects subjects;
    private Date startHour;
    private List <Student> students;
    private Worker worker;
    private Room room;

    public Lesson(Subjects subjects, Date startHour, List<Student> students, Worker worker, Room room)
    {
        this.subjects = subjects;
        this.startHour = startHour;
        this.students = students;
        this.worker = worker;
        this.room = room;
    }

    public Subjects getSubjects()
    {
        return subjects;
    }

    public Date getStartHour()
    {
        return startHour;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public Worker getWorker()
    {
        return worker;
    }

    public Room getRoom()
    {
        return room;
    }

    public void setSubjects(Subjects subjects)
    {
        this.subjects = subjects;
    }

    public void setStartHour(Date startHour)
    {
        this.startHour = startHour;
    }

    public void setStudents(List<Student> students)
    {
        this.students = students;
    }

    public void setWorker(Worker worker)
    {
        this.worker = worker;
    }

    public void setRoom(Room room)
    {
        this.room = room;
    }


    public void printInfo()
    {
        System.out.println("Przedmiot: " + subjects +
                            "Data rozpoczęcia: " + startHour +
                            "Prowadzący: " + worker +
                            "Sala: " + room);
    }
}
