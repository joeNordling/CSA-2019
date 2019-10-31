/**
 * Write a description of class MediaLab here.
 *
 * @author Joe Nordling
 * @version 8/16/19
 */
import java.util.*;

public class MediaLab{
    
    public static double totalCost = 0.0; 
    public static int numSongs = 0;
    public static int totalRatings = 0;
    public static double averageCost = 0.0;
    public static double averageRating = 0.0;
    
    public static void main(){
        System.out.println("Welcome to your Media Library");
        Song testsong = new Song();
        Movie movie1 = new Movie();
        Book book1 = new Book();
        testsong.setTitle("Johnny B. Goode");  
        System.out.println(testsong.getTitle());
        testsong.setRating(9);
        System.out.println(testsong.getRating());
        movie1.setTitle("Endgame");
        System.out.println(movie1.getTitle());
        movie1.setRating(10);
        System.out.println(movie1.getRating());
        book1.setTitle("The Bible");
        System.out.println(book1.getTitle());
        book1.setRating(10);
        System.out.println(book1.getRating());
        Song song1 = new Song("Song1", 1.29,3);
        Song song2 = new Song("Song2", 1.09,6);
        Song song3 = new Song("Song3", 1.99,10);
        Song song4 = new Song("Song4", 0.29,9);
        Song song5 = new Song("Song5", 0.99,3);
        Song song6 = new Song("Song6", 1.47,4);
        Song song7 = new Song("Song7", 0.75,2);
        Song song8 = new Song("Song8", 0.50,7);
        List<Song> listOfSongs = new ArrayList<>(List.of(song1,song2,song3,song4,song5,song6,song7,song8));
        for(Song song : listOfSongs){
            totalCost = totalCost + song.getPrice();
            totalRatings = totalRatings + song.getRating();
            numSongs = numSongs + 1;
        }
        averageCost = totalCost/(double)numSongs;
        averageRating = totalRatings/(int)numSongs;
        System.out.println(averageCost);
        System.out.println(averageRating);
        
        for(Song song : listOfSongs){
            MediaFile.writeString(song.getTitle()+"|"+song.getRating());
        }
        MediaFile.saveAndClose();
    }
}
