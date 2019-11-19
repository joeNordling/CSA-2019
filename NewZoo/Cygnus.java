public abstract class Cygnus extends Anatidae
{
    public Cygnus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Anatidae";
    }
    
    public void getDescriptionCygnus(){
        System.out.println("Cygnus: The swans' closest relatives include the geese and ducks.");
        System.out.println("Swans are grouped with the closely related geese in the subfamily");
        System.out.println("Anserinae where they form the tribe Cygnini. Sometimes, they are");
        System.out.println("considered a distinct subfamily, Cygninae. There are six or seven");
        System.out.println("living (and one extinct) species of swan in the genus Cygnus; in");
        System.out.println("addition, there is another species known as the coscoroba swan,");
        System.out.println("although this species is no longer considered one of the true swans."); 
    }
}