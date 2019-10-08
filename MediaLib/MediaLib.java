public class MediaLib
{
    public static void main()
    {
        Song song2 = new Song(); 
        song2.setTitle("this is the title");
        song2.setRating(10);
        String t = song2.getTitle() + " | " + song2.getRating();
        
        System.out.println(t);
        
        MediaFile.writeString(t);
        MediaFile.saveAndClose();
        
    }
}
