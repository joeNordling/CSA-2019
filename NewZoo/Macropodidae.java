public abstract class Macropodidae extends Diprotodontia
{
    public Macropodidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Diprotodontia";
    }
    
    public void getDescriptionMacropodidae(){
        System.out.println("Macropodidae is a family of marsupials, commonly known as");
        System.out.println("kangaroos, wallabies, tree-kangaroos, wallaroos, pademelons,");
        System.out.println("quokkas, and several other terms. These genera are allied to the");
        System.out.println("suborder Macropodiformes, containing other macropods, and are native");
        System.out.println("to the Australian continent, the mainland and Tasmania, and in");
        System.out.println("New Guinea or nearby islands.");
    }
}