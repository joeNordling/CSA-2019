public abstract class Camelidae extends Artiodactyla
{
    public Camelidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Artiodactyla";
    }
    
    public void getDescriptionCamelidae(){
        System.out.println("Camelids are members of the biological family Camelidae, the only");
        System.out.println("currently living family in the suborder Tylopoda. The extant members");
        System.out.println("of this group are: dromedary camels, Bactrian camels, wild Bactrian");
        System.out.println("camels, llamas, alpacas, vicuñas, and guanacos. Camelids are");
        System.out.println("even-toed ungulates classified in the order Cetartiodactyla, along");
        System.out.println("with pigs, whales, deer, cattle, antelope, and many others.");
    }
}