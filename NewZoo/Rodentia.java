public abstract class Rodentia extends Tetrapoda
{
    public Rodentia(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getName() 
    {
        return super.getName();
    }
    
    public String getDesc()
    {
        return super.getDesc();
    }
    
    public String getParent(){
        return "Tetrapoda";  
    }
    
    public void getDescriptionAnimalia(){
        super.getDescriptionAnimalia();
    }
    
    public void getDescriptionDeuterostomia(){
        super.getDescriptionDeuterostomia();
    }
    
    public void getDescriptionTetrapoda(){
        super.getDescriptionTetrapoda();
    }
    
    public void getDescriptionRodentia(){
        System.out.println("Rodents are mammals of the order Rodentia, which " +
                           "are characterized by a single pair of continuously " +
                           "growing incisors in each of the upper and lower jaws. " +
                           "About 40% of all mammal species are rodents (2,277 species); " +
                           "they are found in vast numbers on all continents except Antarctica. " +
                           "They are the most diversified mammalian order and live in a variety " +
                           "of terrestrial habitats, including human-made environments.");
    }
}
