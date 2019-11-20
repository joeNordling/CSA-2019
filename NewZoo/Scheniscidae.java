public abstract class Scheniscidae extends Sphenisciformes
{
    public Scheniscidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Sphenisciformes";
    }
    
    public void getDescriptionScheniscidae(){
        System.out.println("Spheniscidae are a group of aquatic flightless birds. They live almost");
        System.out.println("exclusively in the Southern Hemisphere, with only one species, the");
        System.out.println("Galapagos penguin, found north of the equator. Highly adapted for");
        System.out.println("life in the water, penguins have countershaded dark and white plumage,");
        System.out.println("and their wings have evolved into flippers.");
    }
}