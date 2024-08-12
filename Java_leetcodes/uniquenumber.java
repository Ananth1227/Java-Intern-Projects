import java.util.Scanner;
public class uniquenumber
{
    public static void main(String[] args)
    {
        int m=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("To find the unique elements in the array that you're gonna given");
        System.out.println("Enter Total no elements of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter The Elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==0)
            {
                m++;
                System.out.println("The unique element is "+arr[i]);
            }
        }
        if(m==0)
        {
            System.out.println("There is no UNIQUE elemnts");
        }
    }
}