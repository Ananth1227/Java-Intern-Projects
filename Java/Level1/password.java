import java.util.Scanner;
public class password
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ran,i=0,k=0;;
        String org = "";
        String numbers = "123467890";
        String lc = "abcdefghijklmnopqrstuvwxyz";
        String uc = "ABCDEFGHIJKLMNOPRSTUVWXYZ";
        String spc = "*&%$#@!~";
        System.out.println("Enter the total number of password");
        int p=sc.nextInt();
        char[] pass;
        pass =new char[p];
        System.out.println("You can add the below one after another as your wish");
        while(true && k==0)
        {
            System.out.println("1.Number\n2.Uppercase Alphabets\n3.Lowercase Alphabets\n4.Special Character\n5.To generate your password\n6.Exit\n");
            System.out.println("Enter Your Choice");
            int n =sc.nextInt();
            if(n==6)
            {
                break;
            }
            switch(n)
            {
                case 1:
                org+=numbers;
                break;
                case 2:
                org+=uc;
                break;
                case 3:
                org+=lc;
                break;
                case 4:
                org+=spc;
                break;
                case 5:
                {
                    int len = org.length();
                    for(int j=0;j<p;j++)
                    {
                      ran=rand(len);
                      pass[j]=org.charAt(ran);
                    }
                    System.out.println("Your Password is "+new String(pass));
                    k=k+1;
                    break;
                }
                default:
                System.out.println("Enter the valid choice");
                break;    
            }
        }
        sc.close();    

    }
    public static int rand(int len)
    {
        return (int) (Math.random()*len);
    }
}