package main;

import java.util.Date;

public class SmallIndex //pojedynczy wpis
{
    private Subject subject;
    private Worker lecturer;
    private Date dateOfPass;
    private double mark;

    public SmallIndex(Subject subject, Worker lecturer, Date dateOfPass, double mark)
    {
        this.subject = subject;
        this.lecturer = lecturer;
        this.dateOfPass = dateOfPass;
        this.mark = mark;
    }

    public Subject getSubject()
    {
        return subject;
    }

    public Worker getLecturer()
    {
        return lecturer;
    }

    public Date getDateOfPass()
    {
        return dateOfPass;
    }

    public double getMark()
    {
        return mark;
    }

    public void setSubject(Subject subject)
    {
        this.subject = subject;
    }

    public void setLecturer(Worker lecturer)
    {
        this.lecturer = lecturer;
    }

    public void setDateOfPass(Date dateOfPass)
    {
        this.dateOfPass = dateOfPass;
    }

    public void setMark(double mark)
    {
        this.mark = mark;
    }
}
