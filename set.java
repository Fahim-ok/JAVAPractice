import java.util.HashSet;

public class set {

    public static void FindSUb(String str,int index,String newString,HashSet<String>set){
      
      //best case
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
      
        //worst case














      char CUrrnetChar = str.charAt(index);

      FindSUb(str, index+1, newString+CUrrnetChar,set);
      FindSUb(str, index, newString,set);


    }
    public static void main(String[] args) {


        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        FindSUb(str,0,"",set);

    }
    
}
