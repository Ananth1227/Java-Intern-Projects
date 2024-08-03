import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.io.IOException;
public class encdec
{
    public static char dec(char chara)
    {
        int shift=2;
        String uc="ABCDEFGHIJKLMNOPRSTUVWXYZ";
        String lc=uc.toLowerCase();
        char[] uca=uc.toCharArray(); //upper case array
        char[] lca=lc.toCharArray(); //LOwer case array
        for(int i=0;i<uc.length();i++)
        {
            if(uca[i]==chara)
            {
                if(i==0)
                {
                    return uca[24];
                }
                if(i==1)
                {
                    return uca[25];
                }
                return uca[(i-shift)];
            }
            else if(lca[i]==chara)
            {
                if(i==0)
                {
                    return lca[24];
                }
                if(i==1)
                {
                    return lca[25];
                }
                return lca[(i-shift)];
            }
        }
        return chara; 
    }
    public static char enc(char chara)
    {
        int shift=2;
        String uc="ABCDEFGHIJKLMNOPRSTUVWXYZ";
        String lc=uc.toLowerCase();
        char[] uca=uc.toCharArray(); //upper case array
        char[] lca=lc.toCharArray(); //LOwer case array
        for(int i=0;i<uc.length();i++)
        {
            if(uca[i]==chara)
            {
                return uca[(i+shift) % uca.length];
            }
            else if(lca[i]==chara)
            {
                return lca[(i+shift) % uca.length];
            }
        }
        return chara;
    }
    public static void main(String[] args)
    {
        while(true)
        {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the mode");
            System.out.println("1.Encryption\n2.Decryption\n3.Exit");
            int ch=sc.nextInt();
            sc.nextLine();
            switch(ch)
            {
                case 1:
                {
                    String newfile="D:\\JAVA\\Level2\\New folder (2)\\encrypted.txt";
                    String sfop="D:\\JAVA\\Level2\\New folder";  //source Folder path
                    System.out.println("Just move the files that you wanna encrypt/decrypt into this path("+sfop+")");
                    System.out.println("Enter the file name"); 
                    String file=sc.nextLine(); //File name
                    String sfip=sfop+"//"+file;//source file path
                    try(FileReader reader=new FileReader(sfip);FileWriter fw=new FileWriter(newfile))
                    {
                        int c;
                        while((c=reader.read())!= -1)
                        {
                            char cur=((char)c);
                            char ncur=enc(cur);
                            fw.write(ncur);
                        }
                        System.out.println("Encryption is done...\nJust track the path("+newfile+") in your local files");
                    }
                    catch(IOException e)
                    {
                        e.printStackTrace();
                    }
                    break;
                }
                case 2:
                {
                    String newfile="D:\\JAVA\\Level2\\New folder (2)\\encrypted.txt";
                    String newfile1="D:\\JAVA\\Level2\\New folder (2)\\decrypted.txt";
                    try(FileReader fr=new FileReader(newfile);FileWriter fw=new FileWriter(newfile1))
                    {
                        int c;
                        while((c=fr.read()) != -1)
                        {
                            char cur=((char)c);
                            char ncur=dec(cur);
                            fw.write(ncur);
                        }
                        System.out.println("Decryption is done...\nJust track the path("+newfile1+") in your local files");
                    }
                    catch(IOException e)
                    {
                        e.printStackTrace();
                    }
                    break;
                }
                case 3:
                {
                    return;  
                }
            }
        }
    }
}