import java.util.Scanner;
public class Logi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the point");
        int point = sc.nextInt();

        if(point>12 && point<14){
            System.out.println("You are not eligible for making love with someone");

        }
        else if(point>16 || point<45){
            System.out.println("Hope i will find someone ");
        }
        else if (point!=15 || point>23){
            System.out.println("Love is shit");
        }

        //and 
    }
    
}
