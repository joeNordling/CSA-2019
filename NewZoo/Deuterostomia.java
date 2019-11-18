public abstract class Deuterostomia extends Animalia
{
    public Deuterostomia(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getName() 
    {
        return super.getName();
    }
    
    public String getDesc()
    {
        return super.getDesc();
    }
    
    public String getParent(){
        return "Animalia";
    }
    
    public void getDescriptionAnimalia(){
        super.getDescriptionAnimalia();
    }
 
    public void getDescriptionDeuterostomia(){
        System.out.println("Deuterostomia is a subtaxon of the Bilateria branch " +
                           "of the subkingdom Eumetazoa, within Animalia, and are " +
                           "distinguished from protostomes by their deuterostomic " +
                           "embryonic development; in deuterostomes, the first opening "+
                           "(the blastopore) becomes the anus, while in protostomes, " +
                           "it becomes the mouth. (There are some occurrences of deuterostomy " +
                           "among protostomes.)");
    }
}
