import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        double a ;
        double b;
        double c;
        


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
         a = sc.nextDouble();
        System.out.println("enter the second number");
         b = sc.nextDouble();

         System.out.println(a*a);
         System.out.println(b*b);





        
        c = Math.sqrt(a+b);
        System.out.println(c);

    }
    
}
