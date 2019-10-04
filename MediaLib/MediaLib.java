public class MediaLib
{
    public static void main()
    {
       double totalPrice = 0;
       
       System.out.println("Welcome to your media library");
       
       song song1 = new song();
       song1.setPrice(5.25);
       System.out.println(song1.getPrice());
    }
}
