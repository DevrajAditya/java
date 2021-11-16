import java.util.Scanner;

public class perfact_square {
    public static void main(String args[]) 
    {
        int num;
        int ctr=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            ctr++;
        }
        if(ctr%2!=0)
        {
            System.out.println("Perfact Number");
        }
        else{
            System.out.println("Not Perfact Number");
        }
    }
    
}
