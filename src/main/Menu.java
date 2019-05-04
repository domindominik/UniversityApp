package main;

import enums.Sex;
import enums.WorkerType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        List<Subject> subjects =new ArrayList<>();
        List<Lesson> lessons = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Worker> doctors = new ArrayList<>();
        Worker proffesor = new Worker(null,null, null, null, null, null, 888774, null, null);
        Department department = new Department("hwdp", proffesor, doctors, students, lessons, 6, subjects);
        Date dateOfBirth = new Date(1990-11-11);
        Address address2 = new Address("Wawa", "Okopowa", "4", "", "01-123");
        Address address1 = new Address("Breslau", "Jaracza", "6", "9", "51-100");

        Worker monia = new Worker(address1,"Monia", "Zysia", null, Sex.FEMALE, WorkerType.DOCTOR, 25678.02, null, null);


        Student magda = new Student(address2, "Madziunia", "Ssanko", dateOfBirth, Sex.FEMALE, department, 845.18, true, null, null, 6);
        //Student magda = new Student(new Address("wawa", "Domaniewska", "69", "69", "00-001"), "Madzia", "Blondyna", null, Sex.FEMALE, Department.KELNERKA, 2154, true, null, null  );

        Worker stefcio = new Worker(new Address("Wawa", "Mokotowska", "23", "1a", "01-002"), "Stefanek", "Papieski", null, Sex.MALE, WorkerType.PROFESSOR,45219.02,null,null);

       // main.Department tips = new main.Department("Tipsy", stefcio,);

        Room room = new Room(true, true, 123, 666);
        Building building = new Building(null, "Puncher", new Address("wawa", "chwdp", "666", "1", "00-001"));
        Building building2 = new Building(null, "Puncher", new Address("wawa", "chwdp", "666", "1", "00-001"));

        //Worker proffesor = new Worker("Breslau","Maria", "Marianna", null, Sex.MIX, WorkerType.PROFESSOR, 84444, null, null, );



        Student sandra = new Student(address2, "Sandra", "Buldog", dateOfBirth, Sex.FEMALE, department, 54741.19, true, null, null, 2);

        Scanner getAction = new Scanner(System.in);
        while (true)
        {
            System.out.println("Lista studentów: 1 \t Lista pracowników: 2 \t Lista sal: 3 \t Lista Grup: 4 \t Informacje o budynku: 5 \t Sala: 6");
            int action = getAction.nextInt();
            switch (action)
            {
                case 1:
                    magda.printInfo();
                    sandra.printInfo();
                    break;

                case 2:
                    stefcio.printinfo();
                    monia.printinfo();
                    proffesor.printinfo();
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    building.printInfo();

                    break;

                case 6:
                    building2.printInfo();
                    break;

                    default:
                        break;




            }
        }
    }
}
