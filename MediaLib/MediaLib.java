public class MediaLib
{
    public static void main()
    {
        Song song2 = new Song(); 
        song2.setTitle("this is the title");
        String t = song2.getTitle();
        
        System.out.println("Welcome to your media library");
        
        MediaFile.writeString(t);
        MediaFile.saveAndClose();
        
    }
}
