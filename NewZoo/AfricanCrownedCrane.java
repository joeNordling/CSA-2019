public class AfricanCrownedCrane extends Balearica
{
    public AfricanCrownedCrane(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Balearica";
    }
    
    public String makeNoise(){
        return "Honkes with a booming voice";
    }
    
    public String eat(){
        return "Plants, seeds, grain, insects, frogs, worms, " +
               "snakes, small fish and the eggs of aquatic animals.";
    }
}
