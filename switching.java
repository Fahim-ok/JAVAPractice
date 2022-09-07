import java.util.Scanner;
public class switching {

    public static void main(String[] args) {
        //switch is a statement
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age"); 
        int a  = sc.nextInt();       
        switch (a) {
            case 13:System.out.println("Ok i am starting to learn");
                
                break;
            case 45: System.out.println("I love her or maybe not");
            break;
            
            case 23: System.out.println("I love her.yeah she was looking so pretty");
        
            default:
                break;
        }



    }
    
}
