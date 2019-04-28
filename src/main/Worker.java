package main;

import enums.WorkerType;

import java.util.Date;

public class Worker extends Human
{
    private WorkerType workerType;
    private double salary;
    private Date dateStartWorking;
    private WorkerGraphic workerGraphic;

    public Worker(Address address, String name, String surname, Date dateOfBirth, char sex, WorkerType workerType, double salary, Date dateStartWorking, WorkerGraphic workerGraphic)
    {
        super(address, name, surname, dateOfBirth, sex);
        this.workerType = workerType;
        this.salary = salary;
        this.dateStartWorking = dateStartWorking;
        this.workerGraphic = workerGraphic;
    }
}
