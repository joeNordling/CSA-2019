public abstract class Hystricidae extends Rodentia
{
    public Hystricidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Rodentia";  
    }
    
    public void getDescriptionHystricidae(){
        System.out.println("The Hystricidae, are large terrestrial rodents, ");
        System.out.println("distinguished by the spiny covering from which they ");
        System.out.println("take their name. They range over the south of Europe ");
        System.out.println("and the Levant, most of Africa, India, and the maritime ");
        System.out.println("Southeast Asia as far east as Flores.");
    }
}
