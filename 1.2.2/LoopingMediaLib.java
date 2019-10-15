public class LoopingMediaLib
{
    public static void main()
    {
        String songInfo = MediaFile.readString();
        while(songInfo != null){
            System.out.println("Title: " + songInfo.substring(0,songInfo.indexOf("|")));
            System.out.println("Rating: " + songInfo.substring(songInfo.indexOf("|")+1));
            songInfo = MediaFile.readString();
        }
    }
}