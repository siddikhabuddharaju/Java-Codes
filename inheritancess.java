class classone
{
    public
        void class1()
        {
        System.out.print("the class one.\n");
        }
}

class classtwo extends classone
{
    public
        void class2()
        {
        System.out.print("the class two.\n");
        }
}

class classthree extends classone
{
    public
        void class3()
        {
            System.out.print("the class three.\n");
        }
}

class classfour extends classtwo
{
    public
        void class4()
        {
        System.out.print("the class four.\n");
        }
}

    /*class ClassE extends ClassA,ClassB
    {
    }*/
    /Java doesn't support Multiple Inheritance and Hybrid Inheritance./
    
public class inheritancess 
{
    public static void main(String[] args)
    {
        //Simple Inheritance
        System.out.print("Simple Inheritance" + "\n");
        classtwo classs1 = new classtwo();
        classs1.class1();
        classs1.class2();
        //Hierarchical Inheritance
        System.out.print("Hierarchical Inheritance" + "\n");
        classthree classs2 = new classthree();
        classs1.class1();
        classs1.class2();
        classs2.class3();
        classs2.class1();
        //Multi-Level Inheritance
        System.out.print("Multi-Level Inheritance" + "\n");
        classfour classs3 = new classfour();
        classs3.class1();
        classs3.class2();
        classs3.class4();
        /*Java does not support multiple inheritances to avoid the diamond problem
        which causes complexity and ambiguity. Well we can achieve multiple inheritance by the
        concept of interface.*/
    }
}
