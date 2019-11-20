public abstract class Amphibian extends Chordata implements Swimming
{
    public Amphibian(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Chordata";
    }
    
    public void getDescriptionAmphibian(){
        System.out.println("Modern amphibians are all Lissamphibia. They inhabit a wide variety");
        System.out.println("of habitats, with most species living within terrestrial, fossorial,");
        System.out.println("arboreal or freshwater aquatic ecosystems. Thus amphibians typically");
        System.out.println("start out as larvae living in water, but some species have developed");
        System.out.println("behavioural adaptations to bypass this. The young generally undergo");
        System.out.println("metamorphosis from larva with gills to an adult air-breathing form with lungs"); 
    }
}
