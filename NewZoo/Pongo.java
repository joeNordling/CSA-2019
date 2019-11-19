public abstract class Pongo extends Hominidae
{
    public Pongo(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Hominidae";
    }
    
    public void getDescriptionPongo(){
        System.out.println("The orangutans are three extant species of great apes native to Indonesia and Malaysia.");
        System.out.println("Orangutans are currently only found in the rainforests of Borneo and Sumatra. Classified");
        System.out.println("in the genus Pongo, orangutans were originally considered to be one species. From 1996,");
        System.out.println("they were divided into two species: the Bornean orangutan and the Sumatran orangutan.");
    }
}