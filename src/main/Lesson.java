package main;


import java.util.Date;
import java.util.List;

public class Lesson
{
    private Subject subject;
    private Date startHour;
    private List <Student> students;
    private Worker lecturer;
    private Room room;

    public Lesson(Subject subject, Date startHour, List<Student> students, Worker lecturer, Room room)
    {
        this.subject = subject;
        this.startHour = startHour;
        this.students = students;
        this.lecturer = lecturer;
        this.room = room;
    }

    public Subject getSubject()
    {
        return subject;
    }

    public Date getStartHour()
    {
        return startHour;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public Worker getLecturer()
    {
        return lecturer;
    }

    public Room getRoom()
    {
        return room;
    }

    public void setSubject(Subject subject)
    {
        this.subject = subject;
    }

    public void setStartHour(Date startHour)
    {
        this.startHour = startHour;
    }

    public void setStudents(List<Student> students)
    {
        this.students = students;
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public void setLecturer(Worker lecturer)
    {
        this.lecturer = lecturer;
    }

    public void setRoom(Room room)
    {
        this.room = room;
    }

    public void printInfo()
    {
        System.out.println("Przedmiot: " + subject +
                            "Data rozpoczęcia: " + startHour +
                            "Prowadzący: " + lecturer +
                            "Sala: " + room);
    }
}
