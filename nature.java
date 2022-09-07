public class nature {
    public static int natureNum(int input){
        //base case
        if(input<=1){
            return input;
        }
        return input + natureNum((input-1));
    }







    public static void main(String args[]){
        int result = natureNum(10);  
        System.out.println(result); 
    
    
    }
    
}
