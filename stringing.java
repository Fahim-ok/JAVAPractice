

import java.util.*;
public class stringing {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String name = sc.nextLine();
        String name1 = sc.nextLine();

        String sum = name + name1;
        String add = sum.substring(0,sum.length()-1);
        System.out.println(add);

        for (int i =0;i<sum.length();i++){

            if(name.compareTo(name1)==0){
                System.out.println("names are fine");

            }
            else if(name.compareTo(name1)>2){
                System.out.println("i dont know");
            }
            System.out.println(sum.charAt(i));
        }



        
    }
    
}
