public abstract class Mammalia extends Chordata implements Walking
{
    public Mammalia(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Chordata";
    }
    
    public void getDescriptionMammalia(){
        System.out.println("Mammalia are vertebrate animals that are");
        System.out.println("characterized by the presence of mammary");
        System.out.println("glands which in females produce milk for");
        System.out.println("feeding (nursing) their young, a neocortex");
        System.out.println("(a region of the brain), fur or hair, and three middle ear bones."); 
    }
}
