public abstract class Acinonyx extends Felidae
{
    public Acinonyx(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Felidae";
    }
    
    public void getDescriptionAcinonyx(){
        System.out.println("Acinonyx is a genus within the cat family. The only living species");
        System.out.println("of this genus, the cheetah lives in open grasslands of Africa and Asia.");
    }
}