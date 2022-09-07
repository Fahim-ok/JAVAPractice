public class strRe{

    public static void MoveAll(String str , int idx,int count,String NewString){
        //best case
        if(idx == str.length()){
            for(int i = 0;i<count;i++){
                NewString += 'x';
                
            }

            System.out.println(NewString);
                return;

        }

        char CUrrnetChar = str.charAt(idx);
        if(CUrrnetChar == 'x'){
            count ++;
            MoveAll(str, idx+1, count, NewString);
        }
        else{
            NewString += CUrrnetChar;
            MoveAll(str, idx+1, count, NewString);
        }
    }
    public static void main(String[] args) {
        String str = "abxdfxx";
        MoveAll(str, 0, 0, " ");
    }
}