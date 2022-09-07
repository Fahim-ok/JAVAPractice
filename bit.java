import java.util.*;
public class bit {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("enter the bit");
        int opt = sc.nextInt();

        int pos = 2;
        int n = 9;

        int bitmask = 1<<pos;
        //set
        //if(opt ==1){
          //  int newNum = bitmask|n;
            //System.out.println(newNum);
        //}
        //clear
        if(opt ==0) {
            int NOTTY = ~(bitmask);
            int NMA  = bitmask & n;
            System.out.println(NMA);
        }


    }

    
}
