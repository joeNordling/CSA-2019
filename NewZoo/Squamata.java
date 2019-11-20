public abstract class Squamata extends Reptilia
{
    public Squamata(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Reptilia";
    }
    
    public void getDescriptionSquamata(){
        System.out.println("Squamata is the largest order of reptiles, comprising");
        System.out.println("lizards, snakes and amphisbaenians (worm lizards), which");
        System.out.println("are collectively known as squamates or scaled reptiles.");
        System.out.println("With over 10,000 species, it is also the second-largest");
        System.out.println("order of extant (living) vertebrates, after the perciform");
        System.out.println("fish, and roughly equal in number to the Saurischia");
        System.out.println("(one of the two major groups of dinosaurs)"); 
    }
}
