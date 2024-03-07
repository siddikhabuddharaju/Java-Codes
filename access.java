package week6;

class AccessSpecifierDemo
{
    private
        int priVar;
    protected
        int proVar;
    public
        int pubVar;

        void setVar(int privatevar,int protectedvar, int publicvar)
        {
            priVar = privatevar;
            proVar = protectedvar;
            pubVar = publicvar;
        }

        void getVar()
        {
            System.out.println("Private Variable :- "+priVar);
            System.out.println("Protected Variable :- "+proVar);
            System.out.println("Public Variable :- "+pubVar);
        }
}

public class access
{
    public static void main(String[] args) 
    {
        AccessSpecifierDemo obj = new AccessSpecifierDemo();
        obj.setVar(23,234,2345);
        obj.getVar();
    }
}
