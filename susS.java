public class susS {
    public static void Subse(String str, int idx,String Newstr){
        //best case 
        if(idx == str.length()){
            System.out.println(Newstr);
            return;
        }


        char CurrentChar = str.charAt(idx);
        Subse(str, idx+1, Newstr+CurrentChar);
        Subse(str, idx+1, Newstr);

    }
    public static void main(String[] args) {
        String str = "abc";
        Subse(str, 0, "");





    }
    
}
