public abstract class Phoenicopterus extends Phoenicopteridae
{
    public Phoenicopterus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Phoenicopteridae";
    }
    
    public void getDescriptionPhoenicopterus(){
        System.out.println("No Information");
    }
}