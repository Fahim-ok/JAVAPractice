import java.util.*;

public class arr2 {
    public static void main(String[] args) {
    Scanner sc = new  Scanner(System.in);
    int size = sc.nextInt();
    int box []= new int [size];

    //input the array
    for(int i = 1;i<size;i++){
        box [i] = sc.nextInt();
    }
    //output
    for(int i = 1;i<size;i++){
        System.out.print(box[i]);
    }
        
    }
    
}
