public abstract class studen
{
    String name;
    String dept;
    String college="mvgr";
    abstract void exampreparation(String subjname,double hrs);
}
class gayii extends studen{
    void exampreparation(String subjname,double hrs){
        System.out.println("I always choose one day batting");
    }
    public static void main(String args[]){
        gayii obj=new gayii();
        obj.exampreparation("all subjects",5);
    }
}
