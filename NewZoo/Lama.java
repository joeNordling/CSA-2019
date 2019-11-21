public abstract class Lama extends Camelidae
{
    public Lama(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Camelidae";
    }
    
    public void getDescriptionLama(){
        System.out.println("Lama is a genus containing two South American camelids,");
        System.out.println("the wild guanaco and the domesticated llama. This genus");
        System.out.println("is closely allied to the wild vicuña and domesticated alpaca");
        System.out.println("of the genus Vicugna. Before the Spanish conquest of the");
        System.out.println("Americas, llamas and alpacas were the only domesticated");
        System.out.println("ungulates of the continent.");
    }
}