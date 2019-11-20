public abstract class Artiodactyla extends Mammalia
{
    public Artiodactyla(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Mammalia";
    }
    
    public void getDescriptionArtiodactyla(){
        System.out.println("Artiodactyla are ungulates – hoofed animals – which bear weight");
        System.out.println("equally on two (an even number) of the five toes: their third and");
        System.out.println("fourth toes. The other three toes are either present, absent, vestigial,");
        System.out.println("or pointing posteriorly.");
    }
}