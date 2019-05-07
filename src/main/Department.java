package main;

import java.util.List;

public class Department
{
    private String name;
    private Worker professor;
    private List<Worker> doctors;
    private List<Student> students;
    private List<Lesson> lessons;
    private int quantityOfSemesters;
    private List<Subject> subjects;

    public Department(String name, Worker professor, List<Worker> doctors, List<Student> students, List<Lesson> lessons, int quantityOfSemesters, List<Subject> subjects)
    {
        this.name = name;
        this.professor = professor;
        this.doctors = doctors;
        this.students = students;
        this.lessons = lessons;
        this.quantityOfSemesters = quantityOfSemesters;
        this.subjects = subjects;
    }

    public String getName()
    {
        return name;
    }

    public Worker getProfessor()
    {
        return professor;
    }

    public List<Worker> getDoctors()
    {
        return doctors;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public List<Lesson> getLessons()
    {
        return lessons;
    }

    public int getQuantityOfSemesters()
    {
        return quantityOfSemesters;
    }

    public List<Subject> getSubjects()
    {
        return subjects;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setProfessor(Worker professor)
    {
        this.professor = professor;
    }

    public void setDoctors(List<Worker> doctors)
    {
        this.doctors = doctors;
    }

    public void setStudents(List<Student> students)
    {
        this.students = students;
    }

    public void setLessons(List<Lesson> lessons)
    {
        this.lessons = lessons;
    }

    public void setQuantityOfSemesters(int quantityOfSemesters)
    {
        this.quantityOfSemesters = quantityOfSemesters;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void printInfo()
    {
        System.out.println("Nazwa kierunku: " + name +
                ", Profesor prowadzący: " + professor +
                ", Ilość semestrów: " + quantityOfSemesters);
    }
}
