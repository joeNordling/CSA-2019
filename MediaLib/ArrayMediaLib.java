public class ArrayMediaLib
{
    public ArrayMediaLib()
    {      
      /*String[] sharingFriends = 
        {
            new String("Friend1"),
            new String("Friend2"),
            new String("Friend3"),
            new String("Friend4"),
            new String("Friend5")
        };
        for (int i = 0; i < 5; i++)
        {
            System.out.println(sharingFriends[i]);
        }
        
        double[] daysBtwnPurchase = {2,5,1,2,4,2,1,3};
        System.out.println(Avg(daysBtwnPurchase));*/
<<<<<<< Updated upstream
        song[] topTensongs =
        {
            new song("The Twist"), 
            new song("Smooth"), 
            new song("Mack the Knife"), 
            new song("How Do I Live"), 
            new song("Party Rock Anthem"), 
            new song("I Gotta Feeling"),
            new song("Macarena"), 
            new song("Physical"), 
            new song("You Light Up My Life"), 
            new song("Hey Jude") 
        };
        for (song s: topTensongs)
        {
        System.out.println(s.getTitle());
=======
        String[] songNames = 
        {
            new String("The Twist"),
            new String("Smoooth"),
            new String("Mack the Knife"),
            new String(""),
            new String(""),
            new String(""),
            new String(""),
            new String(""),
            new String(""),
            new String("")
        };
        Song[] topTenSongs =
        {
            new Song(),
            new Song(),
            new Song(),
            new Song(),
            new Song(),
            new Song(),
            new Song(),
            new Song(),
            new Song(),
            new Song()
        };
        for (int i = 0; i < 10; i++)
        {
            
>>>>>>> Stashed changes
        }
    }
    public double Avg(double[] DL)
    {
        double total = 0;
        double count = 0;
        
        for (double current : DL)
        {
            total = total + current;
            count++;
        }
        return(total/count);
    }
}
