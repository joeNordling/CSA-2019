public abstract class Bovidae extends Artiodactyla
{
    public Bovidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Artiodactyla";
    }
    
    public void getDescriptionBovidae(){
        System.out.println("The Bovidae are the biological family of cloven-hoofed, ruminant mammals");
        System.out.println("that includes bison, African buffalo, water buffalo, antelopes, wildebeest,");
        System.out.println("impala, gazelles, sheep, goats, muskoxen, and domestic cattle. A member of");
        System.out.println("this family is called a bovid. With 143 extant species and 300 known extinct");
        System.out.println("species, the family Bovidae consists of eight major subfamilies apart from");
        System.out.println("the disputed Peleinae and Pantholopinae.");
    }
}