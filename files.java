import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
class File 
{
    public void Copy() 
    {
        FileInputStream input;
        FileOutputStream output;
        try
        {
            input=new FileInputStream("source");
            output=new FileOutputStream("destination");
            try
            {
                int var= input.read();
                output.write(var);
                while(var!=-1)
                {
                    var= input.read();
                    output.write(var);
                }       
            }
            catch(IOException obj1)
            {
                System.out.println("Error occured");
            }
                }
        catch(FileNotFoundException obj)
        {
            System.out.println("File is not cretaed");
        }
    }
    public static void main(String args[])
    {
        File f1=new File();
        f1.Copy();
    }
}
