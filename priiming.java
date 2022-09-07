import java.util.*;




public class priiming {
    public static boolean checker(int n){
        boolean Flag = false;
        //worst case
        if(n<=1){
            Flag =false;
            return Flag;
        }
        else{
            for (int i =2;i<=n/2;i++){
                if(n%i==0){
                    Flag = false;
                    
                    break;
                }
                else{

                  return Flag =true;
                }
                
            }
            return Flag;
        }
    }

        
                
       


                       
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        boolean checking = checker(n);
        if(checking){
            System.out.println("prime num");
        }
        else{
            System.out.println("not prime");
        }



    }
    
}
