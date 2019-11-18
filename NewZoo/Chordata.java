public abstract class Chordata extends Animalia
{
    public Chordata(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Animalia";
    }
    
    public void getDescriptionChordata(){
        System.out.println("During some period of their life cycle,");
        System.out.println("chordates possess a notochord, a dorsal");
        System.out.println("nerve cord, pharyngeal slits, an endostyle,"); 
        System.out.println("and a post-anal tail: these five anatomical"); 
        System.out.println("features define this phylum. Chordates are");
        System.out.println("also bilaterally symmetric; and have a coelom,"); 
        System.out.println("metameric segmentation, and a circulatory system.");
    }
}
