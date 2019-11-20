public abstract class Dendrobatidae extends Anura
{
    public Dendrobatidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Anura";
    }
    
    public void getDescriptionDendrobatidae(){
        System.out.println("Dendrobatidae which are native to tropical Central and South America.");
        System.out.println("These species are diurnal and often have brightly colored bodies.");
        System.out.println("This bright coloration is correlated with the toxicity of the species,");
        System.out.println("making them aposematic. Some species of the family Dendrobatidae exhibit");
        System.out.println("extremely bright coloration along with high toxicity, while others have");
        System.out.println("cryptic coloration with minimal to no amount of observed toxicity.");
    }
}