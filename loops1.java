import java.util.Scanner;
public class loops1 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the num");
     int z = sc.nextInt();

     for (int i = 1;i<=10;i++){
         System.out.println("the table is"  +  z * i);
     }
    
}
}
