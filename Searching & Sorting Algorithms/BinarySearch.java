import java.util.Arrays;

public class BinarySearch
{
    public static void Main(){
        String[] FirstArray = {"a","c","e","o","r", "u"};
        String[] SecondArray = {"a","b","c","d","e","f","g"};
        String[] ThirdArray = {"a","w","y","z"};
        long startTime;
        long endTime;
        startTime = System.nanoTime();
        System.out.println("R found at index " + BinarySearch(FirstArray, "r"));
        endTime = System.nanoTime();
        System.out.println("BinarySearch 1 ran in " + (endTime - startTime) + " Nanoseconds");
        startTime = System.nanoTime();
        System.out.println("V found at index " + BinarySearch(SecondArray, "v"));
        endTime = System.nanoTime();
        System.out.println("BinarySearch 2 ran in " + (endTime - startTime) + " Nanoseconds");
        startTime = System.nanoTime();
        System.out.println("A found at index " + BinarySearch(ThirdArray, "a"));
        endTime = System.nanoTime();
        System.out.println("BinarySearch 3 ran in " + (endTime - startTime) + " Nanoseconds");
    }
    
    public static int BinarySearch(String[] Array, String value){
        if(Array[Array.length/2].compareTo(value) > 0){
            for(int i = 0; i < Array.length/2; i++){
                if(Array[i].equals(value)){
                    return i;
                }
            }
        } else {
            for(int i = Array.length/2; i < Array.length; i++){
                if(Array[i].equals(value)){
                    return i;
                }
            }
        }
        return -1;
    }
}
