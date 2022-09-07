public class dup {
    public static boolean []map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String NewString){
       //best case
       if(idx == str.length()){
           System.out.println(NewString);
           return;
       }
       
       
       
        //maping the charctter

        char CurrentChar = str.charAt(idx);
        if(map[CurrentChar - 'a']){
            removeDuplicates(str, idx+1, NewString);
        }
        else{
            NewString += CurrentChar;
            map[CurrentChar - 'a'] = true;

            removeDuplicates(str, idx+1, NewString);
        }
    }
    public static void main(String[] args) {
        String str = "aabbsd";
        removeDuplicates(str, 0, "");
    }
    
}
