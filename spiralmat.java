import java.util.*;
public class spiralmat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the order");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int spiral [][]= new int[m][n];

        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                spiral[i][j]=sc.nextInt();

            }
        }

        int rowStart = 0;
        int rowEnd = m-1;
        int colStart = 0;
        int colEnd = n-1;
//checker first
        while(rowStart<=rowEnd && colStart<=colEnd){

            for(int row= rowStart;row<=rowEnd;row++){
                System.out.print(spiral[row][colEnd] + " ");
                
            }
            colEnd--;

            for (int col = colStart;col<=colEnd;col++){
                System.out.print(spiral[rowStart][col] + " ");
                
            }
            rowStart--;

            for (int row = rowEnd;row>=rowStart;row--){
                System.out.print(spiral[row][colStart] + " ");
            }
            colStart++;

            for(int col= colEnd;col>=colStart;col--){
                System.out.print(spiral[rowEnd][col] + " ");
            }
            rowEnd--;

            System.out.println();

        }

    }
    
}
