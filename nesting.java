
import java.util.Scanner;

public class nesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        int col;
        //String name ;
        System.out.println("Enter the number of rows");
        row = sc.nextInt();
        System.out.println("Enter the number of col");
        col = sc.nextInt();
        //System.out.println("enter the symbol");

        for(int i = 1;i<=row;i++){
            System.out.println(i);
            for(int j = 1;j<=col;j++){
                System.out.println(j);
                 
            }
        }
        
    }
    
}
