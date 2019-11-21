public abstract class Coendou extends Erethizontidae
{
    public Coendou(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Erethizontidae";  
    }
    
    public void getDescriptionCoendou(){
        System.out.println("Among the most notable features of Coendou porcupines are");
        System.out.println("their unspined prehensile tails. The front and hind feet");
        System.out.println("are also modified for grasping. These limbs all contribute");
        System.out.println("to making this animal an adept climber, an adaptation to");
        System.out.println("living most of their lives in trees.");
    }
}
