package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task3
{

    public static void main(String[] args)
    {
        int bajt;

        try(FileInputStream fis = new FileInputStream("abc1.txt");
            FileOutputStream fos = new FileOutputStream("abc2.txt"))
        {
            do
            {
                bajt = fis.read();
                if ((char) bajt == ' ') bajt = '-';
                if (bajt != -1) fos.write(bajt);

            }
            while (bajt != -1);
        }
        catch (IOException e) {
            System.out.println("Error was detected");
        }
    }
}