public class AfricanCrestedPorcupine extends Hystrix
{
    public AfricanCrestedPorcupine(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getName() 
    {
        return super.getName();
    }
    
    public String getDesc()
    {
        return super.getDesc();
    }
    
    public String getParent(){
        return "Hystrix";  
    }
    
    public void getDescriptionAnimalia(){
        super.getDescriptionAnimalia();
    }
    
    public void getDescriptionDeuterostomia(){
        super.getDescriptionDeuterostomia();
    }
    
    public void getDescriptionTetrapoda(){
        super.getDescriptionTetrapoda();
    }
    
    public void getDescriptionRodentia(){
        super.getDescriptionRodentia();
    }
    
    public void getDescriptionHystricidae(){
        super.getDescriptionHystricidae();
    }
    
    public void getDescriptionHystrix(){
        super.getDescriptionHystrix();
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
