public abstract class Dendrolagus extends Macropodidae
{
    public Dendrolagus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Macropodidae";
    }
    
    public void getDescriptionDendrolagus(){
        System.out.println("They inhabit the tropical rainforests of New Guinea and far");
        System.out.println("northeastern Queensland, along with some of the islands in the");
        System.out.println("region. Most tree-kangaroos are considered threatened due to");
        System.out.println("hunting and habitat destruction. They are the only true arboreal macropods");
    }
}