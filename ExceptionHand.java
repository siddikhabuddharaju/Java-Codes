import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
class ExceptionHand
{
    public
    float result;
    void divide(int num[])
    {
        try
        {
            for(int i=0;i<10;i++)
            try
            {
                int a;
                result=2/num[i];
                System.out.println("the result= "+result);
            }
            catch(ArithmeticException obj)
            {
                System.out.println("Third exception");
                System.out.println("Divide by zero is not possible send any integer type data");
            }
        }
        catch(IndexOutOfBoundsException obj)
        {
            System.out.println("Fourth exception");
            System.out.println("The iteration exceeded its limts");
        }
        catch(NullPointerException n)
        {
        }
        finally
        {
            System.out.println("Block of code is executed");
        }
    }

    public void create()
    {
        try
        {
            FileOutputStream f1=new FileOutputStream("sample");
            FileInputStream f2=new FileInputStream("sample");
            try
            {
                f1.write(65);
                System.out.println(f2.read());
            }
            catch(IOException obj1)
            {
                System.out.println("Data not inserted");
            }
        }
        catch(FileNotFoundException obj)
        {
            System.out.println("File you created is not available");
        }
    }

    public static void main(String args[])
    {
        int num[]={1,2,0,4,5};
        ExceptionHand obj;
        try
        {
            obj=new ExceptionHand();
            obj.getClass().getMethod("Divide");
        }
        catch(NoSuchMethodException e)
        {
            System.out.println("first exception");
            System.out.println("funtion is not available");
        }
        try
        {
            String a=null;
            System.out.println(a.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("Second Exception:\nNull value is initiated");
        }
        finally
        {
            obj=new ExceptionHand();
            obj.divide(num);
            obj.create();
        }
    }
}
