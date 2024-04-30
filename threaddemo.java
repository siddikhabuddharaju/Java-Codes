public class threaddemo extends Thread
{
    String name;
    threaddemo(String nam)
    {
    name=nam;
    }
    public void run()
    {
        System.out.println("thread run method started by "+name);
    }
    public void start()
    {
    System.out.println("thread execution started");
    }
    //public void notify(){}
    public static void main(String args[])
    {
        threaddemo t1=new threaddemo("Siddikha");
        threaddemo t2=new threaddemo("Buddharaju");
        t1.run();
        t2.run();
        t1.start();
        t2.start();
    }
}
