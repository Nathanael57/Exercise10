import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ShowFile {
    public static void main(String[] args) throws IOException  {

        FileInputStream fis;
        int bajt;

        try{
            fis = new FileInputStream("testabc.txt");
            //open the file
            //C:\Users\Aish Tet\IdeaProjects\Exercise_10\src\ShowFile.java
        } catch(FileNotFoundException e){
            System.out.println("File Not Found");
            return;
        }

        //read Files until EDF is encountered

        try{
           do {
               bajt = fis.read();
               if (bajt != -1)
                   System.out.print((char)bajt);
           } while (bajt != -1);
        } catch (IOException e) {
            System.out.println("Error Reading File");
        }

        finally {
            try{
                fis.close();
            } catch (IOException e) {
                System.out.println("Error closing File");
            }
        }
    }
}
