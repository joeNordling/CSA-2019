
/**
 * Write a description of class checkBoard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class checkBoard
{
    String[][] board = new String[8][8];
    
    public checkBoard()
    {
        
    }
    
    public void doBoard(){
        int i = 0;
        int j = 0;
        for(String[] row : board){
            for(String item : row){
                if(j < 3){
                    if(j%2 == 0){
                        if(i%2 != 0){
                            board[j][i] = "Black";
                        }
                    } else {
                        if(i%2 == 0){
                            board[j][i] = "Black";
                        }
                    }
                }
                if(j > 4){
                    if(j%2 == 0){
                        if(i%2 != 0){
                            board[j][i] = "White";
                        }
                    } else {
                        if(i%2 == 0){
                            board[j][i] = "White";
                        }
                    }
                }
                i++;
            }
            i = 0;
            j++;
        }
    }
    
    public void printBoard(){
        for(String[] row : board){
            for(String item : row){
                System.out.print(item + " ");
            }
            System.out.println("");
        }
    }
}
