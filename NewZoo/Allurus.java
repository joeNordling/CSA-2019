public abstract class Allurus extends Ailuridae
{
    public Allurus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Ailuridae";
    }
    
    public void getDescriptionAllurus(){
        System.out.println("The red panda has reddish-brown fur, a long, shaggy tail,");
        System.out.println("and a waddling gait due to its shorter front legs; it is");
        System.out.println("roughly the size of a domestic cat, though with a longer");
        System.out.println("body, and is somewhat heavier");
    }
}