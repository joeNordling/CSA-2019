public abstract class Anatidae extends Anseriformes
{
    public Anatidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Anseriformes";
    }
    
    public void getDescriptionAnatidae(){
        System.out.println("The Anatidae are the biological family of water birds");
        System.out.println("that includes ducks, geese, and swans. The family has a");
        System.out.println("cosmopolitan distribution, occurring on all the world's");
        System.out.println("continents. These birds are adapted for swimming, floating");
        System.out.println("on the water surface, and in some cases diving in at least shallow water."); 
    }
}