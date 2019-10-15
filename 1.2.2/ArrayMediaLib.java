
/**
 * Write a description of class ArrayMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMediaLib
{
    public static void main(){
        String[] sharingFriends =  {"Kyle","Connor","George","Charlie","Joe"};
        int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        Song[] topTenSongs = {new Song("The Twist"), 
                              new Song("Smooth"), 
                              new Song("Mack the Knife"), 
                              new Song("How Do I Live"), 
                              new Song("Party Rock Anthem"), 
                              new Song("I Gotta Feeling"),
                              new Song("Macarena"), 
                              new Song("Physical"), 
                              new Song("You Light Up My Life"), 
                              new Song("Hey Jude")};
        int total = 0;
        for (int i = 0; i < sharingFriends.length; i++){
            System.out.println(sharingFriends[i]);
        }
        for(int num : daysBtwnPurchase){
            total = total + num;
        }
        double average = Double.valueOf(total)/daysBtwnPurchase.length;
        System.out.println(average);
        
        int count = 0;
        for (Song s: topTenSongs){
            count++;
            if(count%3 == 0){
                s.setPrice(0.99);
            } else {
                s.setPrice(1.29);
            }
        }
        for (Song s: topTenSongs){
            System.out.println(s.getTitle());
            System.out.println(s.getPrice());
        }
        
        boolean skip = false;
        for (Song s: topTenSongs){
            if(skip){
                skip = false;
                continue;
            } else {
                skip = true;
                System.out.println(s.getTitle());
            }
        }
        /*
        for(int i = 0; i < topTenSongs.length; i++){
            topTenSongs[i] = new Song("test");
        }*/
    }
}
