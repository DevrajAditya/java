import java.util.Scanner;

public class greater {

    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number");
        a=sc.nextInt();
        System.out.println("Enter Secound Number");
        b=sc.nextInt();
        if(a>b)
        {
            System.out.printl("A is greater"+a);
        }
        else{
            System.out.printl("B is greater"+a);
        }
 
    }
}
