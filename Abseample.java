interface Person{
   void dsplay();
}
class Student implements Person{
   public void dsplay() {
      System.out.println("This is display method of the Student class");
   }
}
class Lecturer implements Person{
   public void dsplay() {
      System.out.println("This is display method of the Lecturer class");
   }
}
public class Abseample{
   public static void main(String args[]) {
      Person person1 = new Student();
      person1.dsplay();
      Person person2 = new Lecturer();
      person2.dsplay();
   }
}
