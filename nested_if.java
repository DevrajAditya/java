import java.util.*;
public class nested_if {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number");
        a=sc.nextInt();
        System.out.println("Enter Secound Number");
        b=sc.nextInt();
        System.out.println("Enter third Number");
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.printl("A is greater"+a);
        }
        else if(b>a && b>c)
        {
            System.out.printl("B is greater"+b);
        }
            else{
                System.out.printl("C is greater"+c);
                
            }
        }  
 
    }
}
