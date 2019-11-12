import java.util.Arrays;

public class SelectionSort
{
    public static void Main(){
        String[] FirstArray = {"a","e","c","u","o", "r"};
        String[] SecondArray = {"e","c","b","d","f","a","g"};
        String[] ThirdArray = {"w","z","y","a"};
        long startTime;
        long endTime;
        startTime = System.nanoTime();
        System.out.println(Arrays.toString(SelectionSort(FirstArray)));
        endTime = System.nanoTime();
        System.out.println("SelectionSort 1 ran in " + (endTime - startTime) + " Nanoseconds");
        startTime = System.nanoTime();
        System.out.println(Arrays.toString(SelectionSort(SecondArray)));
        endTime = System.nanoTime();
        System.out.println("SelectionSort 2 ran in " + (endTime - startTime) + " Nanoseconds");
        startTime = System.nanoTime();
        System.out.println(Arrays.toString(SelectionSort(ThirdArray)));
        endTime = System.nanoTime();
        System.out.println("SelectionSort 3 ran in " + (endTime - startTime) + " Nanoseconds");
    }
    
    public static String[] SelectionSort(String[] Array){
        int StartingIndex = 0;
        int length = Array.length;
        while(StartingIndex < Array.length - 1){
            int NextLetterIndex = 0;
            int CurrentCount = -1;
            String item1 = Array[StartingIndex];
            for(int i = 0; i < length-1; i++){
                String item2 = Array[StartingIndex + i];
                if(item1.compareTo(item2) > CurrentCount){
                    NextLetterIndex = StartingIndex+i;
                }
            }
            if(NextLetterIndex != 0){
                    Array[StartingIndex] = Array[NextLetterIndex];
                    Array[NextLetterIndex] = item1;
            }
            StartingIndex++;
            length--;
        }
        return Array;
    }
}
