package main;

import enums.Sex;
import enums.WorkerType;
import file.SaveToFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        Room room = new Room(true, true, 123, 666);
        Room room2 = new Room(true, true, 12, 666);
        Room room3 = new Room(true, true, 12, 666);

        List<Subject> subjects =new ArrayList<>();
        List<Department> departments = new ArrayList<>();
        List<Lesson> lessons = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Worker> doctors = new ArrayList<>();
        List<Worker> proffesors = new ArrayList<>();
        List<Worker> masters = new ArrayList<>();
        List<Building> buildings = new ArrayList<>();
        Date dataStartWorking = new Date(1988-12-12);
        Worker proffesor = new Worker(null,null, null, null, null, null, 888774, null, null);
        Department department = new Department("hwdp", proffesor, doctors, students, lessons, 6, subjects);
        Date dateOfBirth = new Date(1990-11-11);
        Address address2 = new Address("Wawa", "Okopowa", "4", "", "01-123");
        Address address1 = new Address("Breslau", "Jaracza", "6", "9", "51-100");

        Worker monia = new Worker(address1,"Monia", "Zysia", null, Sex.FEMALE, WorkerType.DOCTOR, 25678.02, null, null);


        Student magda = new Student(address2, "Madziunia", "Ssanko", dateOfBirth, Sex.FEMALE, department, 845.18, true, null, null, 6);
        //Student magda = new Student(new Address("wawa", "Domaniewska", "69", "69", "00-001"), "Madzia", "Blondyna", null, Sex.FEMALE, Department.KELNERKA, 2154, true, null, null  );

        Worker stefcio = new Worker(new Address("Wawa", "Mokotowska", "23", "1a", "01-002"), "Stefanek", "Papieski", null, Sex.MALE, WorkerType.PROFESSOR,45219.02,null,null);
        Subject subject = new Subject(stefcio, "Tipsy", 96);
        Worker lecturer = new Worker(address1, "Ojciec", "Dyrektor", dateOfBirth, Sex.MIX, WorkerType.PROFESSOR, 988984.11, null, null);

        Lesson lesson = new Lesson(subject, null, students, lecturer, room);
        main.Department tipsy = new main.Department("Tipsy", stefcio, doctors, students, lessons, 7, subjects);

        Building building = new Building(null, "Puncher", new Address("wawa", "chwdp", "666", "1", "00-001"));
        Building building2 = new Building(null, "Puncher", new Address("wawa", "chwdp", "666", "1", "00-001"));




        SmallIndex smallIndex = new SmallIndex(subject, lecturer, null, 5.5);
        Index index = new Index(null, 1, null, true);
        Student sandra = new Student(address2, "Sandra", "Buldog", dateOfBirth, Sex.FEMALE, department, 54741.19, true, null, null, 2);
        Student madzia = new Student(address1, "Madzia", "Buziaczek", dateOfBirth, Sex.MIX, department, 120241.23, true, null, index, 1);
        Worker dario = new Worker(address2, "Dadiusz", "Kwiecień", dateOfBirth, Sex.FEMALE, WorkerType.PROFESSOR, 99999.99, dataStartWorking, null);
        doctors.add(monia);
        departments.add(department);
        departments.add(tipsy);
        students.add(magda);
        students.add(madzia);
        students.add(sandra);
        proffesors.add(dario);

        List<Worker> workers = new ArrayList<>();
        workers.add(monia);
        workers.add(stefcio);

        University university = new University("WSHR", departments, address1, students, workers, buildings);
        students.add(new Student(address1, "Jola", "Fit", dateOfBirth, Sex.MIX, tipsy, 9987458, true, null, null, 1));

        SaveToFile saveToFile = new SaveToFile(university);


        Scanner getAction = new Scanner(System.in);
        while (true)
        {
            System.out.println("Lista studentów: 1 \t Lista pracowników: 2 \t Lista sal: 3 \t Lista Grup: 4 \t Informacje o budynku: 5 \t Sala: 6 \t Lista kierunków: 7");
            int action = getAction.nextInt();
            switch (action)
            {
                case 1:
                    for (Student student: students)
                    {
                        student.printInfo();
                    }

                    break;

                case 2:
                    while (true)
                    {
                        System.out.println("Lista profesorów: 1 \t Lista doktorów: 2 \t Lista masterów: 3 \t Exit: 0");
                        int action2 = getAction.nextInt();

                        switch (action2)
                        {
                            case 1:
                                for (Worker worker: proffesors)
                                {
                                    worker.printInfo();
                                }
                                break;

                            case 2:
                                for (Worker worker: doctors)
                                {
                                    worker.printInfo();
                                }
                                break;
                            case 3:
                                System.out.println("3");
                                break;


                        }

                    }
                    //break;


                case 3:
                    university.printInfo();
                    break;

                case 4:
                    break;

                case 5:
                    building.printInfo();

                    break;

                case 6:
                    building2.printInfo();
                    break;

                case 7:
                    System.out.println(tipsy);
                    break;

                case 8:
                    while (true)
                    {
                        System.out.println("Lista profesorów: 1 \t Lista doktorów: 2 \t Lista masterów: 3 \t Exit: 0");
                        int action3 = getAction.nextInt();

                        switch (action3)
                        {
                            case 1:
                                for (Worker worker: proffesors)
                                {
                                    worker.printInfo();
                                }
                                break;

                            case 2:
                                for (Worker worker: doctors)
                                {
                                    worker.printInfo();
                                }
                                break;
                            case 3:
                                System.out.println("3");
                                break;

                            default:
                                break;
                        }

                    }
                   // break;


                    default:
                        break;




            }
            //break;
        }
    }
}
