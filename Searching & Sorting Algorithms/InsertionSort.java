import java.util.Arrays;

public class InsertionSort
{
    public static void Main(){
        String[] FirstArray = {"a","e","c","u","o", "r"};
        String[] SecondArray = {"e","c","b","d","f","a","g"};
        String[] ThirdArray = {"w","z","y","a"};
        long startTime;
        long endTime;
        startTime = System.nanoTime();
        System.out.println(Arrays.toString(InsertionSort(FirstArray)));
        endTime = System.nanoTime();
        System.out.println("InsertionSort 1 ran in " + (endTime - startTime) + " Nanoseconds");
        startTime = System.nanoTime();
        System.out.println(Arrays.toString(InsertionSort(SecondArray)));
        endTime = System.nanoTime();
        System.out.println("InsertionSort 2 ran in " + (endTime - startTime) + " Nanoseconds");
        startTime = System.nanoTime();
        System.out.println(Arrays.toString(InsertionSort(ThirdArray)));
        endTime = System.nanoTime();
        System.out.println("InsertionSort 3 ran in " + (endTime - startTime) + " Nanoseconds");
    }
    
    public static String[] InsertionSort(String[] Array){
        int StartingIndex = 1;
        while(StartingIndex < Array.length){
          int CurrentCount = -1;
          int PlacementIndex = -1;
          String item1 = Array[StartingIndex];
          for(int i = 0; i < StartingIndex; i++){
              String item2 = Array[i];
              if(item1.compareTo(item2) < 0){
                  PlacementIndex = i;
                  break;
              } else {
                  CurrentCount = item1.compareTo(item2);
              }
          }
          if(StartingIndex != 1 && PlacementIndex != -1){
              for(int i = StartingIndex; i > PlacementIndex; i--){              
                  Array[i] = Array[i-1];
              }
              Array[PlacementIndex] = item1;
              StartingIndex--;
          }
          StartingIndex++;
        }
        return Array;
    }
}
