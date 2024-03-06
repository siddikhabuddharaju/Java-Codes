class classone
{
    public
        void class1()
        {
            System.out.print("Class 1"+"\n");
        }
}

class classtwo extends classone
{
    public
        void class2()
        {
            System.out.print("Class 2"+"\n");
        }
}

class classthree extends classone
{
    public
        void class3()
        {
            System.out.print("Class 3"+"\n");
        }
}

/*class classfour extends classone , classtwo
{
}*/
//Here the actual problem occurs where the support of Multiple Inheritance in java is eliminated.

public class diamond 
{
    public static void main(String[] args)
    {
        System.out.print("Diamond Problem"+"\n");
        classtwo classs1 = new classtwo();
        classthree classs2 = new classthree();
        classs1.class1();
        classs1.class2();
        classs2.class1();
        classs2.class3();
        /*We can access upto half part of the diamond problem. The other half includes the
        multiple Inheritance.
        Java does not support multiple inheritances to avoid the diamond problem which causes
        complexity and ambiguity.
        Well we can achieve multiple inheritance by the concept of interface.*/
    }
}
