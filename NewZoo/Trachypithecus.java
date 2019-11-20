public abstract class Trachypithecus extends Cercopithecidae
{
    public Trachypithecus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Cercopithercidae";
    }
    
    public void getDescriptionTrachypithecus(){
        System.out.println("Their range is split into two parts; one part is much of Southeast Asia");
        System.out.println("(northeast India, southern China, Borneo, Thailand, Java, and Bali), the");
        System.out.println("other part is extreme southern India and Sri Lanka. Most of the species");
        System.out.println("in this genus can be referred to as lutungs, langurs, or leaf monkeys.");
    }
}