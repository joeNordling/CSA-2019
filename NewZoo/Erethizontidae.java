public abstract class Erethizontidae extends Rodentia
{
    public Erethizontidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Rodentia";  
    }
    
    public void getDescriptionErethizontidae(){
        System.out.println("Erethizontidae, are large arboreal rodents, distinguished by");
        System.out.println("their spiny coverings from which they take their name. They");
        System.out.println("inhabit forests and wooded regions across North America, and");
        System.out.println("into northern South America. ");
    }
}
