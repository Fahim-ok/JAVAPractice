import java.util.*;

public class fun1 {
    public static int ProductVar (int a,int b){
        int product = a *b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int pro = ProductVar(a, b);
        System.out.println(pro);
    }

    
}
