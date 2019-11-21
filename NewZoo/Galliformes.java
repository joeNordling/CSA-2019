public abstract class Galliformes extends Aves
{
    public Galliformes(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Aves";
    }
    
    public void getDescriptionGalliformes(){
        System.out.println("Galliformes is an order of heavy-bodied ground-feeding birds");
        System.out.println("that includes turkey, grouse, chicken, New World quail and Old");
        System.out.println("World quail, ptarmigan, partridge, pheasant, francolin, junglefowl");
        System.out.println("and the Cracidae.");
    }
}