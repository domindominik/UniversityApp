package main;

import enums.Sex;
import enums.WorkerType;

import java.util.Date;

public class Worker extends Human
{
    private WorkerType workerType;
    private double salary;
    private Date dateStartWorking;
    private WorkerGraphic workerGraphic;

    public Worker(Address address, String name, String surname, Date dateOfBirth, Sex sex, WorkerType workerType, double salary, Date dateStartWorking, WorkerGraphic workerGraphic)
    {
        super(address, name, surname, dateOfBirth, sex);
        this.workerType = workerType;
        this.salary = salary;
        this.dateStartWorking = dateStartWorking;
        this.workerGraphic = workerGraphic;
    }

    public WorkerType getWorkerType()
    {
        return workerType;
    }

    public double getSalary()
    {
        return salary;
    }

    public Date getDateStartWorking()
    {
        return dateStartWorking;
    }

    public WorkerGraphic getWorkerGraphic()
    {
        return workerGraphic;
    }

    public void setWorkerType(WorkerType workerType)
    {
        this.workerType = workerType;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void setDateStartWorking(Date dateStartWorking)
    {
        this.dateStartWorking = dateStartWorking;
    }

    public void setWorkerGraphic(WorkerGraphic workerGraphic)
    {
        this.workerGraphic = workerGraphic;
    }

    public void printinfo()
    {
        System.out.println("Imię pracownika: " + getName() +
                ", Nazwiskopracownika: " + getSurname() +
                ", Data urodzenia: " + getDateOfBirth() +
                ", Płeć: " + getSex() +
                ", Typ pracownika: " + workerType +
                ", Wynagrodzenie: " + salary +
                ", Data rozpoczęcia pracy: " + dateStartWorking +
                ", Grafik: " + workerGraphic +
                "\n\n");
    }
}
