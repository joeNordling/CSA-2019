public abstract class Pythonidae extends Squamata
{
    public Pythonidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Squamata";
    }
    
    public void getDescriptionPythonidae(){
        System.out.println("The Pythonidae, commonly known simply as pythons, are");
        System.out.println("a family of nonvenomous snakes found in Africa, Asia,");
        System.out.println("and Australia. Among its members are some of the largest");
        System.out.println("snakes in the woarld. Eight genera and 31 species are currently recognized."); 
    }
}
