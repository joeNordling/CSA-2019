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
        System.out.println("Hystrix is a genus of porcupines containing " +
                           "most of the Old World porcupines. Fossils " +
                           "belonging to the genus date back to the late " +
                           "Miocene of Africa.");
    }
}
