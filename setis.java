import java.util.HashSet;

public class setis {

    public static void SubseQ(String str, int index, String newString,HashSet<String>set){
        if(index == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        
        
        char CUrrnetChar = str.charAt(index);

        SubseQ(str, index+1, newString+CUrrnetChar, set);

        SubseQ(str, index, newString, set);
    }
    public static void main(String[] args) {
        String str = "bbb";
        HashSet<String> set = new HashSet<>();
        SubseQ(str,0,"",set);
    }
    
}
