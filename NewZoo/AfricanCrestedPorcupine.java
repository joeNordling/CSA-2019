public class AfricanCrestedPorcupine extends Hystrix
{
    public AfricanCrestedPorcupine(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Hystrix";  
    }
    
    public String makeNoise()
    {
        return "ratttle-hissing noise";
    }
    
    public String eat()
    {
        return "roots";
    }
    
    public String walk()
    {
        return "runs and walks";
    }
}
