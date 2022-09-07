import java.util.*;
public class twod2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int aray2 [][]= new int[row][row];

        for (int i =0;i<row;i++){
            for(int j = 0;j<col;j++){
                aray2[i][j]= sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for(int i =0;i<row;i++){
            for(int j = 0;j<col;j++){
                if (aray2[i][j]==x){
                    System.out.println("x found at location (" + i + ", " + j + ")");
                }
            }
        }
    }
    
}
