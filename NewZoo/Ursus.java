public abstract class Ursus extends Ursidae
{
    public Ursus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Ursidae";
    }
    
    public void getDescriptionUrsus(){
        System.out.println("Ursus is a genus in the family Ursidae (bears) that includes");
        System.out.println("the widely distributed brown bear, the polar bear,the American black bear,");
        System.out.println("and the Asian black bear.");
    }
}