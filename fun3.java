import java.util.*;

public class fun3{
    public static void EvenNumber (int n){
        if (n%2 == 0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        EvenNumber(n);

    }
}