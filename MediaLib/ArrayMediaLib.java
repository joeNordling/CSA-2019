public class ArrayMediaLib
{
    public ArrayMediaLib()
    {
        String[] sharingFriends = 
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
    }
}
