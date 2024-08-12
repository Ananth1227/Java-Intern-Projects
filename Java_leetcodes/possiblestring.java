import java.util.Scanner;
public class possiblestring
{
    public static void print(String[] str)
    {
        int m;
        int tc=0;
        int strc=0; //string Count in the Store array
        for(String str1:str)
        {
            if(str1 != null)
            {
                strc++;
            }
        }
        for(int i=0;i<strc;i++)
        {
            m=0;
            for(int j=0;j<strc;j++)
            {
                if(i==j)
                {
                    continue;
                }
                else
                {
                    if(str[i].equals(str[j]) || str[i]==str[j])
                    {
                        m++;
                    }
                }
            }
            if(m==0)
            {
                tc++;
                System.out.println(str[i]+"-"+tc);
            }
        }
    }
    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        int len=str.length();
        String temp="";
        int n=0;
        for(int i=0;i<len;i++)
        {
            for(int j=n;j<len;j++)
            {
                temp+=str.charAt(j);
            }
            temp+=",";
            n++;
        }
        int m=len-1;
        for(int i=0;i<len;i++)
        {
            if(m==0)
            break;
            for(int j=0;j<len;j++)
            {
                if(m==j)
                {
                    break;
                }
                else
                {
                    temp+=str.charAt(j);
                }
            }
            temp+=",";
            m--;
        }
        String[] arr=temp.split(",");
        System.out.println("The distinct Strings Are");
        print(arr);
    }
}