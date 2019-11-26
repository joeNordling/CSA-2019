import java.util.*;

public class Sort2DArray
{   
    public static void Sort2DArray(){
        int[][] D2Array = {{1,5,4,8,7,3},{2,4,3,5,7,6},{2,4,3,3,6,0},{9,8,9,9,4,1}};
        int[][] SortedArray = modify(D2Array);
        System.out.println(Arrays.deepToString(SortedArray));
    }

    public static int[][] modify(int[][] StartingArray){
        for(int i = 0; i < StartingArray.length; i++){
            if(i % 2 != 0){
                for(int j = 0; j < StartingArray[i].length; j++){
                    StartingArray[i][j] = StartingArray[i-1][j];
                }
            }
        }
        return StartingArray;
    }
}