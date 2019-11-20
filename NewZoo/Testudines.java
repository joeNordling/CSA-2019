public abstract class Testudines extends Reptilia implements Swimming
{
    public Testudines(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Reptilia";
    }
    
    public void getDescriptionTestudines(){
        System.out.println("Testudines characterized by a special bony or cartilaginous");
        System.out.println("shell developed from their ribs and acting as a shield."); 
    }
}
