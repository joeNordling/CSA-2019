public abstract class Vulpes extends Canidae
{
    public Vulpes(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Canidae";
    }
    
    public void getDescriptionVulpes(){
        System.out.println("Vulpes is a genus of the Canidae. The members of this genus");
        System.out.println("are colloquially referred to as true foxes, meaning they form");
        System.out.println("a proper clade. The word 'fox' occurs on the common names of species.");
        System.out.println("True foxes are distinguished from members of the genus Canis, such as");
        System.out.println("dogs, wolves, coyotes, and jackals, by their smaller size (5–11 kg)");
        System.out.println("and flatter skull.");
    }
}