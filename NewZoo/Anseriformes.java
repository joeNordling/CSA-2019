public abstract class Anseriformes extends Aves implements Swimming
{
    public Anseriformes(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Aves";
    }
    
    public void getDescriptionAnseriformes(){
        System.out.println("Anseriformes is an order of birds that comprise about");
        System.out.println("180 living species in three families, which includes over 170");
        System.out.println("species of waterfowl, among them the ducks, geese, and swans.");
        System.out.println("Most modern species in the order are highly adapted for an aquatic");
        System.out.println("existence at the water surface."); 
    }
}