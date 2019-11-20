public abstract class Sphenisciformes extends Aves implements Swimming
{
    public Sphenisciformes(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Aves";
    }
    
    public void getDescriptionSphenisciformes(){
        System.out.println("Although almost all penguin species are native to the Southern Hemisphere,");
        System.out.println("they are not found only in cold climates, such as Antarctica. In fact, only");
        System.out.println("a few species of penguin live so far south. Several species are found in the");
        System.out.println("temperate zone, and one species, the Galápagos penguin, lives near the equator.");
    }
}