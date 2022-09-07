

import java.util.*;


public class fun2 {
    public static void FactorInt(int n){

        if (n<1){
            System.out.println("no more hiding");
            return;
        }
        int fact = 1;
        for(int i = n ;i>=1;i--){
            fact = fact * i ;
            


        }
        System.out.println(fact);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the number");
        int n = sc.nextInt();

        FactorInt(n);

        

    }
    
}
