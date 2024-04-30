public class threaddemo2 implements Runnable 
{
    String name;
    threaddemo2(String nam)
    {
        name=nam;
    }
    public threaddemo2() {}
    public void run(){System.out.println("thread run method started by "+name);}
    public void start(){System.out.println("thread execution started");}
    public static void main(String args[])
    {
        threaddemo2 obj=new threaddemo2("Siddikha");
        Thread t1=new Thread(obj);
        //Thread t2=new Thread("yamu");
        t1.run();
        t1.start();
    }
}
