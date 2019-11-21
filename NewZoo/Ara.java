public abstract class Ara extends Psittaculidae
{
    public Ara(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Psittaculidae";
    }
    
    public void getDescriptionAra(){
        System.out.println("Ara is a neotropical genus of macaws with eight extant species");
        System.out.println("and at least two extinct species. The genus name was coined by");
        System.out.println("French naturalist Bernard Germain de Lacépède in 1799. It gives");
        System.out.println("its name to and is part of the Arini, or tribe of neotropical parrots.");
    }
}