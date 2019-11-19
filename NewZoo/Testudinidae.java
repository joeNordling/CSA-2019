public abstract class Testudinidae extends Testudines
{
    public Testudinidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Testudines";
    }
    
    public void getDescriptionTestudinidae(){
        System.out.println("They are particularly distinguished from other turtles by being land-dwelling");
        System.out.println("while many (though not all) other turtle species are at least partly aquatic.");
        System.out.println("However, like other turtles, tortoises have a shell to protect from predation");
        System.out.println("and other threats."); 
    }
}
