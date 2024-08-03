import java.util.*;
public class pchecker
{
    public static int slc;  //Special Letter count
    public static int llc=0;//Lower Letter count
    public static int ulc=0;//Upper Letter count
    public static void spc(char[] arr1,int l) //Speacial character 
    {
        String splcs="!@#$%^&*()-+<>_?\\\":"; //Special Characters 
        int le=splcs.length();  //length of the above string
        char arr2[]=splcs.toCharArray();
        for(int i=0;i<le;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(arr2[i]==arr1[j])
                {
                    pchecker.slc++;
                }
            }
        }
        if(pchecker.slc==0)
        System.out.println("But,You need to add some special characters to your password to increase its unpredictability.");
        else if(pchecker.slc<3)
        System.out.println("You can add "+(3-slc)+" more special characters in your password for a more secure passcode.");
        else
        System.out.println("Looks like your password has a perfect count of special characters");
    }
    public static void lowc(char[] arr1,int l) //lower character 
    {
        String lowcs="abcdefghijklmnopqrstuvwxyz"; //lower Characters
        char arr2[]=lowcs.toCharArray();
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(arr2[i]==arr1[j])   
                {
                    pchecker.llc++;
                }
            }
        }
        if(pchecker.llc==0)
        System.out.println("But,You need to add some lowercase letters to your password to increase its unpredictability");
        else if(pchecker.llc<3)
        System.out.println("You can add "+(3-llc)+" more lowercase letters to your password for a more secure passcode.");
        else
        System.out.println("Your password has a perfect count of lowercase letters");
    }
    public static void uppc(char[] arr1,int l) //upper character 
    {
        String upcs="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //Upper Characters
        char arr2[]=upcs.toCharArray();
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(arr2[i]==arr1[j])
                {
                    pchecker.ulc++;
                }
            }
        }
        if(pchecker.ulc==0)
        System.out.println("But,you need to add some uppercase letters to your password to increase its unpredictability.");
        else if(pchecker.ulc<3)
        System.out.println("But,you can add " +(3-ulc)+ " more uppercase letters to your password for a more secure passcode.");
        else
        System.out.println("Looks like your password has a perfect count of uppercase letters.");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Submit the password to evaluate its security!");
        String n=sc.nextLine();  //get the password from the user
        int len=n.length();    
        int m=12-len;
        if(m==2 || m==1)
        System.out.println("Your password length appears to be adequate");
        else if(m==0)
        System.out.println("The length of your password is exactly right.");
        else if(m<0)
        System.out.println("Your password length is well good");
        else if(7<m && m<10)
        System.out.println("Your password length isn't sufficient. Try adding " + m + " more digits, characters, or other elements");
        else
        System.out.println("Your password length is really poor. Try adding " + m + " more digits, characters, or other elements");
        char arr[]=n.toCharArray();
        uppc(arr,len);
        lowc(arr,len);
        spc(arr,len);
    }
}