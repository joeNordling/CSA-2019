public abstract class Macropus extends Macropodidae
{
    public Macropus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Macropodidae";
    }
    
    public void getDescriptionMacropus(){
        System.out.println("Macropus is a marsupial genus in the family Macropodidae.");
        System.out.println("It has thirteen extant species, which are divided into three");
        System.out.println("subgenera. The genus includes all terrestrial kangaroos, wallaroos,");
        System.out.println("and several species of wallaby.");
    }
}