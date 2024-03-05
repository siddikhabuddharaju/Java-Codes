class Public
{
    public
        int publicvariable=1;
    private
        int privatevariable=2;
    protected
        int protectedvariable=3;
    public
        int privateaccess()
        {
            return privatevariable;
        }
}
public class pubpropriv
{
    public static void main(String[] args)
    {
        Public publicc = new Public();

        System.out.print("Public : " + publicc.publicvariable + "\n");
        //System.out.print("Public : " + pub.privatevariable);
        //We cannot access the privateVar because it is private i.e, accessible only within the class.
        System.out.print("Private : " + publicc.privateaccess() + "\n");
        System.out.print("Protected : " + publicc.protectedvariable + "\n");
        
    }        
}
