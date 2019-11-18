public abstract class Tetrapoda extends Deuterostomia implements Walking
{
    public Tetrapoda(String name, String desc)
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
        return "Deuterostomia";
    }
    
    public void getDescriptionAnimalia(){
        super.getDescriptionAnimalia();
    }
    
    public void getDescriptionDeuterostomia(){
        super.getDescriptionDeuterostomia();
    }
    
    public void getDescriptionTetrapoda(){
        System.out.println("Tetrapods are four-limbed (with a few exceptions, such as snakes) " +
                           "animals constituting the superclass Tetrapoda. It includes extant " +
                           "and extinct amphibians, reptiles (including dinosaurs and therefore birds), " +
                           "and mammals.");
    }
    
    public String walk() {
        return "runs and walks";
    }
}
