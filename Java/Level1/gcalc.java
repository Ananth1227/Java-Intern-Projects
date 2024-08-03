import java.util.*;
import java.util.Scanner;
public class gcalc
{
    public static void main(String[] args)
    {
        int flag=0;
        Double avg=0.0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Grade Calculator");
        System.out.println("Enter the name of the Student");
        String name=sc.nextLine();
        int[] marks;
        marks=new int[5];
        System.out.println("Enter the Total number of subjects");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the mark of Subject "+(i+1));
            marks[i]=sc.nextInt();
            if(marks[i]<101 && marks[i]>-1)
            {
                continue;
            }
            else
            {
                flag=1;
                break;   
            }
        }
        if(flag==0)
        {
            for(int i=0;i<n;i++)
            {
            avg+=marks[i];
            }
         avg=avg/n;
         System.out.println("Student Name:"+name);
         System.out.println("And his Average Mark is "+avg);
        }
        else
        {
            System.out.println("Mark should be less than 100");
        }
        sc.close();
    }
}