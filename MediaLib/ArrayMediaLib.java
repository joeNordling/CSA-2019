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
        
        int[] daysBtwnPurchase = {2,5,1,2,4,2,1,3};
        System.out.println(totalDay(daysBtwnPurchase));
    }
    public double totalDay(int[] DL)
    {
        double total = 0;
        double dayC = 0;
        
        for (double day : DL)
        {
            total = total + day;
            dayC++;
        }
        return(total/dayC);
    }
}
