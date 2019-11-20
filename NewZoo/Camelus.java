public abstract class Camelus extends Camelidae
{
    public Camelus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Camelidae";
    }
    
    public void getDescriptionCamelus(){
        System.out.println("Camelus that bears distinctive fatty deposits known as 'humps' on");
        System.out.println("its back. Camels have long been domesticated and, as livestock,");
        System.out.println("they provide food (milk and meat) and textiles (fiber and felt");
        System.out.println("from hair). Camels are working animals especially suited to their");
        System.out.println("desert habitat and are a vital means of transport for passengers and cargo.");
    }
}