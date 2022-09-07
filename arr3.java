import java.util.*;

public class arr3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arru []= new int[size];

        //taking the elements to store as a array
        for(int i = 0;i<arru.length;i++){
            arru[i]= sc.nextInt();

        }
        int z = sc.nextInt();
        for(int i =0;i<arru.length;i++){
            if (arru[i]==z){
                System.out.println("the index is " + i);
            }
        }
    }
}



