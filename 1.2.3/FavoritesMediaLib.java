import java.util.Arrays;
import java.util.regex.*;  

public class FavoritesMediaLib
{
    public static void main()
    {
        String songString = MediaFile.readString();
        /*while(!songString.equals("")){
            String name = songString.substring(0,songString.indexOf("|"));
            songString = songString.substring(songString.indexOf("|")+1);
            String rating = songString.substring(0,songString.indexOf("|"));
            songString = songString.substring(songString.indexOf("|")+1);
            System.out.println("Title: " + name);
            System.out.println("Rating: " + rating);
            songString = songString.replaceAll(" ","");
        }*/
        String[] songList = songString.split("\\|");
        // Have to say 200 because both songs and ratings are in list
        System.out.println("My Favorite Songs");
        System.out.println("-----------------");
        for(int i = 0; i < 200; i++){
            try{
                String title = songList[i];
                i++;
                String rating = songList[i];
                if(Integer.valueOf(rating) >= 9){
                    System.out.println(title + "(" + rating + ")");
                }
            }
            catch(Exception e){
                break;
            }
        }
    }
}