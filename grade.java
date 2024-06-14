import java.util.*;
public class grade
{
    public static void main(String args[])
    {
        int n,i;
        double avg=0.0,total=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        n=sc.nextInt();
        int[]mark=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the Marks:");
            mark[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.println(mark[i]);
        }
        for(i=0;i<n;i++)
        {
            total=total+mark[i];
        }
        avg=(total/n);
        System.out.println("the totalmarks"+total);
        System.out.println("the total percentage of marks is:"+avg+"%");
        if(avg>=90 && avg<100)
        {
            System.out.println("Grade:O");
        }
        else if(avg>=80 && avg<90)
        {
            System.out.println("Grade:E");
        }
        else if(avg>=70 && avg<80)
        {
            System.out.println("Grade:A");
        }
        else if(avg>=60 && avg<70)
        {
            System.out.println("Grade:B");
        }
        else if(avg>=50 && avg<60)
        {
            System.out.println("Grade:C");
        }
        else if(avg>=40 && avg<50)
        {
            System.out.println("Grade:D");
        }
        else 
        {
            System.out.println("Grade:Fail");
        }
    }
}
