import java.util.Scanner;

public class count_digit {
    public static void main(String args[])
    { 
        int num;
        int ctr=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        while(num>0)
        {
            num=num/10;
            ctr++;
        }
        System.out.println("number of Digits"+ ctr);
    }        
    }
    
}
