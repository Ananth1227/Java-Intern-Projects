import java.util.regex.*;
import java.util.Scanner;
public class palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String rev = "";
        System.out.println("Enter a word or a phrase");
        String org =sc.nextLine();
        String str1=org.replaceAll("\\p{Punct}","");
        String str2=str1.replaceAll("\\s","");
        int len=str2.length();
        for(int i=len-1;i>=0;i--)
        {
            rev+=str2.charAt(i);
        }
        if(str2.equals(rev))
        {
            System.out.println("The string  "+str2+"  is a  palindrome");
        }
        else
        {
            System.out.println("The string  "+str2+"  is not a palindrome");
        }

    }
}