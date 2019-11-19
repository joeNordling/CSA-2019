public abstract class Rodentia extends Tetrapoda
{
    public Rodentia(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Tetrapoda";  
    }
    
    public void getDescriptionRodentia(){
        System.out.println("Rodents are mammals of the order Rodentia, which ");
        System.out.println("are characterized by a single pair of continuously ");
        System.out.println("growing incisors in each of the upper and lower jaws. ");
        System.out.println("About 40% of all mammal species are rodents (2,277 species); ");
        System.out.println("they are found in vast numbers on all continents except Antarctica. ");
        System.out.println("They are the most diversified mammalian order and live in a variety ");
        System.out.println("of terrestrial habitats, including human-made environments.");
    }
}
