public abstract class Otariidae extends Carnivora implements Swimming
{
    public Otariidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Carnivora";
    }
    
    public void getDescriptionOtariidae(){
        System.out.println("Otariidae, one of three groupings of pinnipeds. They comprise");
        System.out.println("15 extant species in seven genera (another species became extinct");
        System.out.println("in the 1950s) and are commonly known either as sea lions or fur seals,");
        System.out.println("distinct from true seals (phocids) and the walrus (odobenids). Otariids");
        System.out.println("are adapted to a semiaquatic lifestyle, feeding and migrating in the water,");
        System.out.println("but breeding and resting on land or ice. They reside in subpolar, temperate,");
        System.out.println("and equatorial waters throughout the Pacific and Southern Oceans and the");
        System.out.println("southern Indian and Atlantic Oceans. They are conspicuously absent in the");
        System.out.println("north Atlantic.");
    }
}