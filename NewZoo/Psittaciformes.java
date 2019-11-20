public abstract class Psittaciformes extends Aves
{
    public Psittaciformes(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Aves";
    }
    
    public void getDescriptionPsittaciformes(){
        System.out.println(" The order is subdivided into three superfamilies: the Psittacoidea ");
        System.out.println("('true' parrots), the Cacatuoidea (cockatoos), and the Strigopoidea");
        System.out.println("(New Zealand parrots). Parrots have a generally pantropical distribution");
        System.out.println("with several species inhabiting temperate regions in the Southern Hemisphere,");
        System.out.println("as well. The greatest diversity of parrots is in South America and Australasia.");
    }
}