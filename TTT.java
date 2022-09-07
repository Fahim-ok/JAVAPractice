import java.util.*;

public class TTT {

    static ArrayList <Integer> playerPos = new ArrayList<Integer>();
    static ArrayList <Integer> cpuPos = new ArrayList<Integer>();

    public static void main(String args[]){

        char [][] gameBoard = {{' ','|',' ','|',' '},
                               {'-','+','-','+','-'},
                               {' ','|',' ','|',' '},
                               {'-','+','-','+','-'},
                               {' ','|',' ','|',' '}};

    
   while(true){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the position place");
    int pos=  sc.nextInt();

    System.out.println(pos);


    placePiece(gameBoard, pos, "player");

    Random rand = new Random();
    int cpuPos = rand.nextInt(9)+1;
    placePiece(gameBoard, cpuPos, "cpu");

    //using the swith case
   
    


    printGameBoard(gameBoard);  
    String result = checkWinner();
    System.out.println(result);
}
    }

public static void printGameBoard(char [][]gameBoard){
    
    for(char [] row :gameBoard){
        for(char c : row){
            System.out.print(c);
        }
        System.out.println();
    }

}

public static void placePiece(char[][]gameBoard,int pos,String user){
  //checking if its player or cpu

  char symbol = 'x';

  if (user.equals("player")){
      symbol = 'x';
      playerPos.add(pos);
  }
  else if(user.equals("cpu")){
      symbol = 'o';
      cpuPos.add(pos);
  }


    switch(pos){
        case 1:
         gameBoard[0][0] = symbol;
         break;

         case 2:
         gameBoard[0][2] = symbol;
         break;

         case 3:
         gameBoard[0][4] = symbol;
         break;


         case 4:
         gameBoard[2][0] = symbol;
         break;

         case 5:
         gameBoard[2][2] = symbol;
         break;

         case 6:
         gameBoard[2][4] = symbol;
         break;

         case 7:
         gameBoard[4][0] = symbol;
         break;


         case 8:
         gameBoard[4][2] = symbol;
         break;


         case 9:
         gameBoard[4][4] = symbol;
         break;

         default:
         break;

    }


}

public static String checkWinner(){

//wining conditions
    List topR = Arrays.asList(1,2,3);
    List midR = Arrays.asList(4,5,6);
    List botR = Arrays.asList(7,8,9);
    List topC = Arrays.asList(1,4,7);
    List midC = Arrays.asList(2,5,8);
    List botC = Arrays.asList(2,5,8);
    List cross1 = Arrays.asList(1,5,9);
    List cross2= Arrays.asList(7,5,3);

    List<List> winning = new ArrayList<List>();
    winning.add(topR);
    winning.add(midR);
    winning.add(botR);
    winning.add(topC);
    winning.add(midC);
    winning.add(botC);
    winning.add(cross1);
    winning.add(cross2);

    for(List l : winning){
        if(playerPos.containsAll(l)){
            return "congo";
        }
        else if(cpuPos.containsAll(l)){
            return "cpu wins";

        }
        else if(playerPos.size() + cpuPos.size() ==9){
            return "cat";
        }
    }
    


    



    return "";
    
}


}


