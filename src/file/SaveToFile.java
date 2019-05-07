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

    public void SaveToFile()
    {
        try
        {
            File universityDat = new File("universityDat.dat");
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
