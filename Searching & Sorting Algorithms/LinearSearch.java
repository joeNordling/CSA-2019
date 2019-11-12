import java.util.Arrays;

public class LinearSearch
{
    public static void Main(){
        String[] FirstArray = {"a","e","c","u","o", "r"};
        String[] SecondArray = {"e","c","b","d","f","a","g"};
        String[] ThirdArray = {"w","z","y","a"};
        long startTime;
        long endTime;
        startTime = System.nanoTime();
        System.out.println("C found at index " + LinearSearch(FirstArray, "c"));
        endTime = System.nanoTime();
        System.out.println("LinearSearch 1 ran in " + (endTime - startTime) + " Nanoseconds");
        startTime = System.nanoTime();
        System.out.println("V found at index " + LinearSearch(SecondArray, "v"));
        endTime = System.nanoTime();
        System.out.println("LinearSearch 2 ran in " + (endTime - startTime) + " Nanoseconds");
        startTime = System.nanoTime();
        System.out.println("A found at index " + LinearSearch(ThirdArray, "a"));
        endTime = System.nanoTime();
        System.out.println("LinearSearch 3 ran in " + (endTime - startTime) + " Nanoseconds");
    }
    
    public static int LinearSearch(String[] Array, String value){
        for(int i = 0; i < Array.length; i++){
            if(Array[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
}
