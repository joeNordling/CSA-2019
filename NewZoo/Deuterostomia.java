public abstract class Deuterostomia extends Animalia
{
    public Deuterostomia(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Animalia";
    }
    
    public void getDescriptionDeuterostomia(){
        System.out.println("Deuterostomia is a subtaxon of the Bilateria branch ");
        System.out.println("of the subkingdom Eumetazoa, within Animalia, and are ");
        System.out.println("distinguished from protostomes by their deuterostomic ");
        System.out.println("embryonic development; in deuterostomes, the first opening ");
        System.out.println("(the blastopore) becomes the anus, while in protostomes, ");
        System.out.println("it becomes the mouth. (There are some occurrences of deuterostomy ");
        System.out.println("among protostomes.)");
    }
}
