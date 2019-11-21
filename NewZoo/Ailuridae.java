public abstract class Ailuridae extends Carnivora
{
    public Ailuridae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Carnivora";
    }
    
    public void getDescriptionAiluridae(){
        System.out.println("Ailuridae is a family in the mammal order Carnivora.");
        System.out.println("The family consists of the red panda (the sole living representative)");
        System.out.println("and its extinct relatives.");
    }
}