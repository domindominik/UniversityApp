package file;

import main.University;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoadFromFile
{
    private University university;
    private File universityDat = new File("universityDat.dat");

    public LoadFromFile(University university)
    {
        this.university = university;
    }

    public void loadFromFile()
    {
        try
        {
            FileInputStream fileInputStream = new FileInputStream(universityDat);
            ObjectInputStream objectIn = new ObjectInputStream(fileInputStream);

            Object unversity = objectIn.readObject();
            objectIn.close();
        }
        catch (Exception e)
        {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}
