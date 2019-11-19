public abstract class Elephantidae extends Proboscidea
{
    public Elephantidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Proboscidea";
    }
    
    public void getDescriptionElephantidae(){
        System.out.println("The Elephantidae are a family of large, herbivorous");
        System.out.println("mammals collectively called elephants and mammoths.");
        System.out.println("These are terrestrial large mammals with a snout modified");
        System.out.println("into a trunk and teeth modified into tusks. Most genera and");
        System.out.println("species in the family are extinct.");
    }
}