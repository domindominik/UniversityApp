package main;

import enums.Department;
import enums.Sex;
import enums.WorkerType;

import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        Address address1 = new Address("Breslau", "Jaracza", "6", "9", "51-100");

        Worker monia = new Worker(address1,"Monia", "Zysia", null, Sex.FEMALE, WorkerType.DOCTOR, 25678.02, null, null);

        Student magda = new Student(new Address("wawa", "Domaniewska", "69", "69", "00-001"), "Madzia", "Blondyna", null, Sex.FEMALE, Department.TIPSY, 2154, true, null, null  );

        Worker stefcio = new Worker(new Address("Wawa", "Mokotowska", "23", "1a", "01-002"), "Stefanek", "Papieski", null, Sex.MALE, WorkerType.PROFESSOR,45219.02,null,null);

        Room room = new Room(true, true, 123, 666);
        Building building = new Building(null, "Puncher", new Address("wawa", "chwdp", "666", "1", "00-001"));
        Building building2 = new Building(null, "Puncher", new Address("wawa", "chwdp", "666", "1", "00-001"));

        Scanner getAction = new Scanner(System.in);
        while (true)
        {
            System.out.println("Lista studentów: 1 \t Lista pracowników: 2 \t Lista sal: 3 \t Lista Grup: 4 \t Informacje o budynku: 5 \t Sala: 6");
            int action = getAction.nextInt();
            switch (action)
            {
                case 1:
                    magda.printInfo();
                    break;

                case 2:
                    stefcio.printinfo();
                    monia.printinfo();
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
