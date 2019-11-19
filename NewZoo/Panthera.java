public abstract class Panthera extends Felidae
{
    public Panthera(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Felidae";
    }
    
    public void getDescriptionPanthera(){
        System.out.println("Panthera is a genus within the family Felidae that");
        System.out.println("was named and described by Lorenz Oken in 1816 who");
        System.out.println("placed all the spotted cats in this group.");
    }
}