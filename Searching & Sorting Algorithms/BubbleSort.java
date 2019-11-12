import java.util.Arrays;

public class BubbleSort
{
    public static void Main(){
        String[] FirstArray = {"a","c","e","u","o", "r"};
        String[] SecondArray = {"e","c","b","d","f","a","g"};
        String[] ThirdArray = {"w","z","y","a"};
        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(BubbleSort(FirstArray)));
        long endTime = System.nanoTime();
        System.out.println("BubbleSort 1 ran in " + (endTime - startTime) + " Nanoseconds");
        startTime = System.nanoTime();
        System.out.println(Arrays.toString(BubbleSort(SecondArray)));
        endTime = System.nanoTime();
        System.out.println("BubbleSort 2 ran in " + (endTime - startTime) + " Nanoseconds");
        startTime = System.nanoTime();
        System.out.println(Arrays.toString(BubbleSort(ThirdArray)));
        endTime = System.nanoTime();
        System.out.println("BubbleSort 3 ran in " + (endTime - startTime) + " Nanoseconds");
    }
    
    public static String[] BubbleSort(String[] Array){
        int StartingIndex = 0;
        int CorrectCount = 0;
        while(CorrectCount < Array.length - 1){
            String item1 = Array[StartingIndex];
            String item2 = Array[StartingIndex + 1];
            if(item2.compareTo(item1) < 0){
                Array[StartingIndex] = item2;
                Array[StartingIndex + 1] = item1;
                CorrectCount = 0;
            } else {
                CorrectCount++;
            }
            StartingIndex++;
            StartingIndex = StartingIndex >= Array.length - 1 ? 0 : StartingIndex;
        }
        return Array;
    }
}
