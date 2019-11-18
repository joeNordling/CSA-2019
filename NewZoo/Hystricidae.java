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
        System.out.println("The Hystricidae, are large terrestrial rodents, " +
                           "distinguished by the spiny covering from which they " +
                           "take their name. They range over the south of Europe " +
                           "and the Levant, most of Africa, India, and the maritime " +
                           "Southeast Asia as far east as Flores.");
    }
}
