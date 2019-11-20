public abstract class Dendrobates extends Dendrobatidae
{
    public Dendrobates(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Dendrobatidae";
    }
    
    public void getDescriptionDendrobates(){
        System.out.println("Dendrobates is a genus of poison dart frogs native to Central");
        System.out.println("and South America. Dendrobates once contained over 40 species,");
        System.out.println("but most species originally placed in Dendrobates have been split");
        System.out.println("off into the genera Oophaga, Ranitomeya, Andinobates, and Phyllobates.");
    }
}