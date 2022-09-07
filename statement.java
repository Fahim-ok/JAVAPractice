import java.util.Scanner;


public class statement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age ");
        int z  = sc.nextInt();

        if (z>18){
            System.out.println("You have to work hard ");
        }
        else if(z<18){
            System.out.println("You have to explore");
        }
        else{
            System.out.println("i love her");
        }
        
        
    }
    
}
