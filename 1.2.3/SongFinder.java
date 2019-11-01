public class SongFinder
{
   public static int findTitle(Song[] songs, String target){
     if(songs == null || target == null){
         return -1;
     }
     for (int i = 0; i < songs.length; i++){
        String word = songs[i].getTitle();
        if (word.equals(target)) {
            return i;
        }
     }
     return -1;
   }
   
   public static int getIndexLastDiscount(Song[] songs, double compare){
        if (songs == null) {
            System.out.println("Null song");
            return -1;
        }
        for(int i = 0; i < songs.length; i++){
            System.out.println(songs[i].getTitle());
        }
        for (int i = songs.length - 1; i >=0; i--) {
            if (songs[i].getPrice() < compare) {
                return i;
            }
        }
        return -1;
   }    
   
   public static int getIndexLastTitle(Song[] songs){
        int i;
        if (songs == null) {
           return -1;
        }
        for (i = 0; i < songs.length; i++) {
           // skip if no title
           if (songs[i].getTitle().equals("")) {
               return -1;
           }
        }
        return i-1;
    }
}