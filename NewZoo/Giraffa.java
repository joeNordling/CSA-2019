public abstract class Giraffa extends Giraffidae
{
    public Giraffa(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Giraffidae";
    }
    
    public void getDescriptionGiraffa(){
        System.out.println("The giraffa is an African artiodactyl mammal, the tallest");
        System.out.println("living terrestrial animal and the largest ruminant. It is");
        System.out.println("traditionally considered to be one species, Giraffa");
        System.out.println("camelopardalis, with nine subspecies. However the existence");
        System.out.println("of up to eight extant giraffe species have been described,");
        System.out.println("based upon research into the mitochondrial and nuclear DNA,");
        System.out.println("as well as morphological measurements of Giraffa.");
    }
}