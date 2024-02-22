import java.util.*;

class Student
{
    public
        String fullName;
        int rollNum;
        double semPercentage;
        String collegeName;
        int collegeCode;
        void displaydetails()
        {
            System.out.println("Name :- "+fullName);
            System.out.println("RollNumber :- "+rollNum);
            System.out.println("Sem Percentage :- "+semPercentage);
            System.out.println("College Name :- "+collegeName);
            System.out.println("College Code :- "+collegeCode);
        }
        Student()
        {
            System.out.println("The Student ID has been Created !");
        }
}

public class Constdest
{
    public static void main(String[] args) 
    {
        Student Siddikha = new Student();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name :- ");
        Siddikha.fullName = input.nextLine();
        System.out.print("Enter the Roll Number :- ");
        Siddikha.rollNum = input.nextInt();
        System.out.print("Enter the Sem percentage :- ");
        Siddikha.semPercentage = input.nextDouble();
        System.out.print("Enter the College Name :- ");
        input.nextLine();
        Siddikha.collegeName = input.nextLine();
        System.out.print("Enter the College Code :- ");
        Siddikha.collegeCode = input.nextInt();

        input.close();

        Siddikha.displaydetails();

    }
}
