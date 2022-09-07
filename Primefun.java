import java.util.*;
public class Primefun{
    public static boolean Checker(int n){
        boolean PrimeCheck = false;
        if(n<=1){
            PrimeCheck = false;
            return PrimeCheck;
            
        }
        else{
            for(int i =2;i<=n/2;i++){
                if(n%i==0){
                    PrimeCheck =false;
                }
                else{
                    PrimeCheck = true;
                }

            }
            return PrimeCheck;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the num : ");
        int n = sc.nextInt();
        boolean checking = Checker(n);
        if (checking == true){
            System.out.println(" a prime");
            


        }
        else{
            System.out.println("prime");

        }

        
    }
}