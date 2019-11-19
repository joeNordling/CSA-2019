public abstract class Hystrix extends Hystricidae
{
    public Hystrix(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Hystricidae";  
    }
    
    public void getDescriptionHystrix(){
        System.out.println("Hystrix is a genus of porcupines containing ");
        System.out.println("most of the Old World porcupines. Fossils ");
        System.out.println("belonging to the genus date back to the late ");
        System.out.println("Miocene of Africa.");
    }
}
