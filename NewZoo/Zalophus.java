public abstract class Zalophus extends Otariidae
{
    public Zalophus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Otariidae";
    }
    
    public void getDescriptionZalophus(){
        System.out.println("Zalophus is a coastal eared seal native to western North America.");
        System.out.println("It is one of six species of sea lion. Its natural habitat ranges");
        System.out.println("from southeast Alaska to central Mexico, including the Gulf of");
        System.out.println("California. Sea lions are sexually dimorphic; males are larger than");
        System.out.println("females, and have a thicker neck, and protruding sagittal crest.");
    }
}