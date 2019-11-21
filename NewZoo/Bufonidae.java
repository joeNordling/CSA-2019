public abstract class Bufonidae extends Anura
{
    public Bufonidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Anura";
    }
    
    public void getDescriptionBufonidae(){
        System.out.println("This is the only family of anurans in which all members");
        System.out.println("are known as toads, although some may be called frogs");
        System.out.println("The bufonids now comprise more than 35 genera, Bufo being");
        System.out.println("the most widespread and well known.");
    }
}