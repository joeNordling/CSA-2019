public abstract class Otocyon extends Canidae
{
    public Otocyon(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Canidae";
    }
    
    public void getDescriptionOtocyon(){
        System.out.println("Otocyon named for its large ears, which are used for thermoregulation.");
        System.out.println("Fossil records show this canid first appeared during the middle Pleistocene,");
        System.out.println("about 800,000 years ago.");
    }
}