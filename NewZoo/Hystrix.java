public abstract class Hystrix extends Hystricidae
{
    public Hystrix(String name, String desc)
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
        return "Hystricidae";  
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
        System.out.println("Hystrix is a genus of porcupines containing " +
                           "most of the Old World porcupines. Fossils " +
                           "belonging to the genus date back to the late " +
                           "Miocene of Africa.");
    }
}
