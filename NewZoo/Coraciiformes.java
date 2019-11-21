public abstract class Coraciiformes extends Aves
{
    public Coraciiformes(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Aves";
    }
    
    public void getDescriptionCoraciiformes(){
        System.out.println("The Coraciiformes are a group of usually colorful birds");
        System.out.println("including the kingfishers, the bee-eaters, the rollers,");
        System.out.println("the motmots, and the todies. They generally have syndactyly,");
        System.out.println("with three forward-pointing toes (and toes 3 & 4 fused at their base)");
        System.out.println("though in many kingfishers one of these is missing.");
    }
}