import java.util.Scanner;

public class inpu {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the name ");

        String name =  sc.nextLine();
        System.out.println(name);

        System.out.println("adding two numbers");
        int a = sc.nextInt();
        System.out.println(a);

        System.out.println("enter the second num");
        int b = sc.nextInt();
        System.out.println(b);

        int sum;
        sum =  a +b;
        System.out.println(sum);

        double c = 395;
        //declare the data type again in the code 
        c = (double)c /3;
        System.out.println(c);

    }
}
