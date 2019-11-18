public abstract class Gruidae extends Gruiformes
{
    public Gruidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Gruiformes";
    }
    
    public void getDescriptionGruidae(){
        System.out.println("The Gruidae are a family,");
        System.out.println("of large, long-legged, and long-necked");
        System.out.println("birds in the group Gruiformes. The 15");
        System.out.println("species of cranes are placed in four genera.");
        System.out.println("Unlike the similar-looking but unrelated herons,");
        System.out.println("cranes fly with necks outstretched, not pulled back.");
        System.out.println("Cranes live on all continents except Antarctica and");
        System.out.println("South America.");
    }
}
