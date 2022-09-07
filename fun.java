import java.util.*;


public class fun{
    public static int CalcutlateSum(int a , int b){
        int sum = a + b;
        return sum;

    }


public static void main(String[] args) {
    Scanner sc=  new Scanner(System.in);
    System.out.println("enter the first number");
    int a = sc.nextInt();
    System.out.println("enter the second number");
    int b = sc.nextInt();

    int summer  = CalcutlateSum(a, b);
    System.out.println(summer);
}
}