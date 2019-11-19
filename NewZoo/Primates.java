public abstract class Primates extends Mammalia
{
    public Primates(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Mammalia";
    }
    
    public void getDescriptionPrimates(){
        System.out.println("A primate is a eutherian mammal constituting the taxonomic order Primates. Primates arose");
        System.out.println("85–55 million years ago first as plesiadapiformes[2] from small terrestrial mammals (Primatomorpha)");
        System.out.println("which adapted to living in the trees of tropical forests: many primate characteristics represent");
        System.out.println("adaptations to life in this challenging environment, including large brains, visual acuity,");
        System.out.println("color vision, altered shoulder girdle, and dexterous hands.");
    }
}