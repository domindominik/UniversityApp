package file;

import main.University;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class SaveToFile
{
    private University university;

    public SaveToFile(University university)
    {
        this.university = university;
    }

    public void saveToFile()
    {
        try
        {
            File universityDat = new File("/home/dominik/Pobrane/studentdata.txt");
            ObjectOutputStream objectUniversity = new ObjectOutputStream(new FileOutputStream(universityDat));

            objectUniversity.writeObject(university);
            objectUniversity.flush();
            objectUniversity.close();
        }
        catch (Exception e)
        {
            System.out.println("Error!");
            e.printStackTrace();
        }


    }
}
