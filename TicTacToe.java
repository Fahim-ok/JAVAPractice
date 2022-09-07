import javax.print.attribute.standard.PrinterName;
import java.util.*;
import java.util.Random;

public class TicTacToe {
    public static void main(String args[]){

       //building the game board
        char[][] board = {{' ', ' ', ' '},
                         {' ', ' ', ' '},
                         {' ', ' ', ' '}};
        Printname (board);

        //Scanner sc = new Scanner(System.in);

        PlayerTurn(board);

        Random rand = new Random();
        int Comprange;

        while(true){
        Comprange = rand.nextInt(9)+1;
        if(isSpaceNeed(board,Comprange)){
            break;

        }
    }
    placeMove(board, Integer.toString(Comprange), 'o');
    Printname(board);

}
    private static boolean isSpaceNeed (char[][]board,int position){
        switch ( position){
            case 1:
            return (board[0][0] == ' ');
            
            case 2:
            return (board[0][1] == ' ');
            

            case 3:
            return (board[0][2] == ' ');
            

            case 4:
            return (board[1][0] == ' ');
           
            
            case 5 :
            return (board[1][1] == ' ');
            

            case 6:
            return (board[1][2] == ' ');
            

            case 7:
            return (board[2][0] == ' ');
     
            case 8:
            return (board[2][1] == ' ');
           

            case 9:
            return (board[2][2] == ' ');
           

            default:
            return false;
        



        }

    }


    private static void PlayerTurn(char[][] board){
        Scanner sc = new Scanner(System.in);

     
        
        System.out.println("READY TO PLAY? (1-9)");
        String user = sc.nextLine();

        placeMove(board, user, 'x');
        sc.close();
    }
        

    private static  void placeMove (char [][]board,String position, char symbol){

    

        switch ( position){
            case "1":
            board[0][0] = symbol;
            break;

            case "2":
            board[0][1] = symbol;
            break;

            case "3":
            board[0][2] = symbol;
            break;

            case "4":
            board[1][0] = symbol;
            break;
            
            case "5":
            board[1][1] = symbol;
            break;

            case "6":
            board[1][2] = symbol;
            break;

            case "7":
            board[2][0] = symbol;
            break;

            case "8":
            board[2][1] = symbol;
            break;

            case "9":
            board[2][2] = symbol;
            break;

            default:
            System.out.println("nikal bhosdk");
        



        }
    

        Printname(board);

    }

    
   


     
                        
    private static void Printname(char [][] board) {
         
                        
     System.out.println("|"+ board[0][0] + "|" + board[0][1] + "|"+board[0][2] + "|");
     System.out.println("-------");
     System.out.println("|" + board[1][0] + "|" + board[1][1] + "|"+board[1][2]  + "|");
     System.out.println("-------");
     System.out.println ("|"+ board[2][0] + "|" + board[2][1] + "|"+board[2][2] + "|");
    }
    
}
