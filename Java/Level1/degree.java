import java.util.Scanner;
public class degree
{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("Fahrenheit To Celsius");
        System.out.println("Enter the unit");
        String uh=n.nextLine();
        char ch=uh.charAt(0);
        System.out.println("Enter the value");
        Double val=n.nextDouble();
        if(ch =='f' || ch =='F')
        {
            Double res=(val-32)*(5.0/9);
            System.out.println("Fahrenheit To Celsius is "+res);
        }
        else if(ch=='c' || ch=='C')
        {
            Double res=(val*9.0/5)+32;
            System.out.println("Celsius To Fahrenheit is "+res);
        }
        else{
            System.out.println("Invalid");
        }
        n.close();
    }
}