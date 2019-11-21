public abstract class Ursidae extends Carnivora
{
    public Ursidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Carnivora";
    }
    
    public void getDescriptionUrsidae(){
        System.out.println("Bears are carnivoran mammals of the family Ursidae.");
        System.out.println("They are classified as caniforms, or doglike carnivorans.");
        System.out.println("Although only eight species of bears are extant, they are widespread,");
        System.out.println("appearing in a wide variety of habitats throughout the Northern");
        System.out.println("Hemisphere and partially in the Southern Hemisphere.");
    }
}