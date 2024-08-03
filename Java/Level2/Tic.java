import java.util.*;
public class tic
{
    public static int p1=0;
    public static int p2=0;
    public static void printarray(char[][] mat1)
    {
        for(char[] ar:mat1)
        {
            for(char br:ar)
        {
            System.out.print(br+" ");
        }
        System.out.println();
        }
        System.out.println("\n----------");      
    }
    public static void tie(char[][] mat1)
    {
        int x=9;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(mat1[i][j]=='X' || mat1[i][j]=='O')
                {
                    x--;
                }
            }
        }
        if(x==0)
        {
            System.out.println("The match is knotted.");
            tic.p1++;
            tic.p2++;
            return;
        }
    }
    public static void chzl(char[][] mat1)   //Horizontal Checker
    {
        int x=0,y=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(mat1[i][j]=='X')
                x++;
                if(mat1[i][j]=='O')
                y++;
            }
            if(x==3)
            {
                System.out.println("p1 is winnerchzl");
                tic.p1++;
                return;
            }
            else
            {
                x=0;
            }    
            if(y==3)
            {
                System.out.println("p2 is the winnerchzl");
                tic.p2++;
                return;
            }    
            else
            {
                y=0;
            } 
        }
    }
    public static void cvtl(char[][] mat1)  //vertical cheker 
    {
        int x=0,y=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(mat1[j][i]=='X')
                x++;
                if(mat1[j][i]=='O')
                y++;
            }
            if(x==3)
            {
                System.out.println("p1 is winnercvtl");
                tic.p1++;
                return;
            }
            else
            {
                x=0;
            }
            if(y==3)
            {
                System.out.println("p2 is the winnecvtl");
                tic.p2++;
                return;
            }
            else
            {
                y=0;
            }
          
        }
    }
    public static void dig(char[][] mat1)     //Right to left Diagonal checker
    {
        int x=0;
        int y=0;
        for(int i=0,j=2;i<3 && j>=-1;i++,j--)
        {
            if(mat1[i][j]=='X')
            x++;
            if(mat1[i][j]=='O')
            y++;
        }
        if(x==3)
        {
            System.out.println("p1 is winnerd");
            tic.p1++;
            return;
        }
        else
        {
            x=0;
        }
        if(y==3)
        {
            System.out.println("p2 is the winnerd");
            tic.p2++;
            return;
        }
        else
        {
            y=0;
        }
        
    }
    public static void dig1(char[][] mat1) //Left to Right Diagonal checker
    {
        int x=0;
        int y=0;
        for(int i=0,j=0;i<3 && j<3;i++,j++)
        {
            if(mat1[j][i]=='X')
            x++;
            if(mat1[j][i]=='O')
            y++;
        }
        if(x==3)
        {
            System.out.println("p1 is winnerd11");
            tic.p1++;
            return;
        }
        else
        {
            x=0;
        }
        if(y==3)
        {
            System.out.println("p2 is the winnerd12");
            tic.p2++;
            return;
        }
        else
        {
            y=0;
        }  
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        char p='1';
        char[][] mat={
            {'-','-','-'}, //(0,0) (0,1) (0,2)
            {'-','-','-'}, //(1,0) (1,1) (1,2)
            {'-','-','-'}  //(2,0) (2,1) (2,2)
            };
        printarray(mat);
        int ch=0;
        while(ch!=1)
        {
            if(p=='1')
            {
                System.out.println("\t\t PLAYER 1 Turn");
                System.out.println("Enter the Row");
                i=(sc.nextInt())-1;
                System.out.println("Enter the Column");
                j=(sc.nextInt())-1;
                mat[i][j]='X';
                tie(mat);
                chzl(mat);
                cvtl(mat);
                dig(mat);
                dig1(mat);
                printarray(mat);
                if(tic.p1==1)
                {
                    ch++;
                    break;
                }
                p='2';
            }
            else
            {
                System.out.println("\t\t PLAYER 2 Turn");
                System.out.println("Enter the Row");
                i=(sc.nextInt())-1;
                System.out.println("Enter the Column");
                j=(sc.nextInt())-1;
                mat[i][j]='O';
                tie(mat);
                chzl(mat);
                cvtl(mat);
                dig(mat);
                dig1(mat);
                printarray(mat);
                if(tic.p2==1)
                {
                    ch++;
                    break;
                }
                p='1';
            }
        }
    }
}