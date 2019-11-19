public abstract class Caracal extends Felidae
{
    public Caracal(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Felidae";
    }
    
    public void getDescriptionCaracal(){
        System.out.println("Caracal is a genus of the subfamily Felinae in the family");
        System.out.println("Felidae. Previously, it was considered to be a monotypic genus,");
        System.out.println("consisting of only the type species: Caracal caracal, commonly called caracal.");
    }
}