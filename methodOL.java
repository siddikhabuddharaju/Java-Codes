// METHOD OVERLOADING IN JAVA

class arithmeticaddition
{
    public
        int add (int a,int b)
        {
            return a+b;
        }
        double add (double a,double b)
        {
            return a+b;
        }
        int add (int a,int b,int c)
        {
            return a+b+c;
        }
}

public class methodOL
{
    public static void main(String[] args) 
    {
        arithmeticaddition doadd = new arithmeticaddition();
        System.out.println("Sum of Integers :- "+doadd.add(5,6));
        System.out.println("Sum of Integers :- "+doadd.add(7.9,5.6));
        System.out.println("Sum of Integers :- "+doadd.add(1,2,3));
    }
    
}
