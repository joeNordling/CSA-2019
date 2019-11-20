public abstract class Morelia extends Pythonidae
{
    public Morelia(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Pythonidae";
    }
    
    public void getDescriptionMorelia(){
        System.out.println("Morelia is a genus of large snakes in the family");
        System.out.println("Pythonidae found in Indonesia, New Guinea, and");
        System.out.println("throughout Australia. Currently, up to eight species are recognized.");
        System.out.println("In general, these snakes are arboreal to semiarboreal,");
        System.out.println("spending much of their lives in the forest canopy.");
        System.out.println("Although exceptions occur, most attain adult lengths of 2–3 m"); 
    }
}
