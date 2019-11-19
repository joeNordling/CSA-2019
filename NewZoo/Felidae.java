public abstract class Felidae extends Carnivora
{
    public Felidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Carnivora";
    }
    
    public void getDescriptionFelidae(){
        System.out.println("Felidae is a family of mammals in the order Carnivora,");
        System.out.println("colloquially referred to as cats, and constitutes a clade.");
        System.out.println("A member of this family is also called a felid. The term 'cat'");
        System.out.println("refers both to felids in general and specifically to the domestic");
        System.out.println("cat (Felis catus).");
    }
}