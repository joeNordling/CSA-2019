public abstract class Macaca extends Cercopithecidae
{
    public Macaca(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Cercopithercidae";
    }
    
    public void getDescriptionMacaca(){
        System.out.println("Macaques are found in a variety of habitats throughout");
        System.out.println("the Asian continent and are highly adaptable. Certain");
        System.out.println("species have learned to live with humans and have become");
        System.out.println("invasive in some human-settled environments, such as the");
        System.out.println("island of Mauritius and Silver Springs State Park in Florida.");
    }
}