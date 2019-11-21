public abstract class Hippopotaminae extends Hippopotamidae
{
    public Hippopotaminae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Hippopotamidae";
    }
    
    public void getDescriptionHippopotaminae(){
        System.out.println("Hippopotamus is a genus of artiodactyl mammals consisting of one extant species,");
    }
}