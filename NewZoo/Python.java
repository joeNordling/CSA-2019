public abstract class Python extends Pythonidae
{
    public Python(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Pythonidae";
    }
    
    public void getDescriptionPython(){
        System.out.println("Python is a genus of constricting snakes in the Pythonidae");
        System.out.println("family native to the tropics and subtropics of the Eastern Hemisphere.");
        System.out.println("The name Python was proposed by François Marie Daudin in 1803 for");
        System.out.println("non-venomous flecked snakes. Currently, 10 python species are");
        System.out.println("recognized as valid taxa. Three formerly considered python");
        System.out.println("subspecies have been promoted, and a new species recognised."); 
    }
}
