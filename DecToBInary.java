

public class DecToBInary {

    public static void main(String args[]){
        String binary = findBinary(233, "");

        System.out.println(binary);
    }


public static String findBinary(int decimel , String result){
    if(decimel == 0){
        return result;
    }
    result = decimel%2 + result;
    return findBinary(decimel/2, result);
}

    
}


