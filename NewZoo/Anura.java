public abstract class Anura extends Amphibian
{
    public Anura(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Amphibian";
    }
    
    public void getDescriptionAnura(){
        System.out.println(" The oldest fossil 'proto-frog' appeared in the early Triassic");
        System.out.println("of Madagascar, but molecular clock dating suggests their origins");
        System.out.println("may extend further back to the Permian, 265 million years ago.");
        System.out.println("Frogs are widely distributed, ranging from the tropics to subarctic");
        System.out.println("regions, but the greatest concentration of species diversity is in");
        System.out.println("tropical rainforests. There are over 6,300 recorded species,");
        System.out.println("accounting for around 88% of extant amphibian species.");
    }
}