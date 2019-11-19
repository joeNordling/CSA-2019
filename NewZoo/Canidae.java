public abstract class Canidae extends Carnivora
{
    public Canidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Carnivora";
    }
    
    public void getDescriptionCanidae(){
        System.out.println("The biological family Canidae is a lineage of carnivorans");
        System.out.println("that includes domestic dogs, wolves, coyotes, foxes, jackals,");
        System.out.println("dingoes, and many other extant and extinct dog-like mammals.");
        System.out.println("A member of this family is called a canid ");
    }
}