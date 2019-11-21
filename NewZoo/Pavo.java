public abstract class Pavo extends Phasianidae
{
    public Pavo(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Phasianidae";
    }
    
    public void getDescriptionPavo(){
        System.out.println("Pavo is a genus of two species in the pheasant family.");
        System.out.println("The two species, along with the Congo peacock, are known as peafowl.");
    }
}