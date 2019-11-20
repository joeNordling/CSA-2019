public abstract class Reptilia extends Chordata
{
    public Reptilia(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Chordata";
    }
    
    public void getDescriptionReptilia(){
        System.out.println("Reptilia, comprising today's turtles, crocodilians, snakes,");
        System.out.println("amphisbaenians, lizards, tuatara, and their extinct relatives.");
        System.out.println("The study of these traditional reptile orders, historically combined");
        System.out.println("with that of modern amphibians, is called herpetology."); 
    }
}
