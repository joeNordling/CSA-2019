public abstract class Bucerotiformes extends Aves
{
    public Bucerotiformes(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Aves";
    }
    
    public void getDescriptionBucerotiformes(){
        System.out.println("Bucerotiformes is an order that contains the hornbills,");
        System.out.println("hoopoe and wood hoopoes. Sometimes classified as members");
        System.out.println("of Coraciiformes although increasing amount of evidence");
        System.out.println("seem to support these birds being distinctive enough to warrant their own order."); 
    }
}