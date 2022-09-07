import javax.swing.text.StyledEditorKit.BoldAction;

public class resort {
    public static boolean Cheking (int arr [],int index){
        //best case
        if(index == arr.length-1){
            return true;
        }

        if(arr[index]<arr[index+1]){
            return Cheking(arr, index+1);
        }
        else{
            return false;
        }

        


    }



    public static void main(String[] args) {
       int arr[] = {1,2,3,4};
       System.out.println(Cheking(arr,0));

    }
    
}
