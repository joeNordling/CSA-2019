public class RedPanda extends Allurus
{
    public RedPanda(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "purrs";
    }
    
    public String eat()
    {
        return "Bamboo, but also eats eggs, birds, and insects.";
    }
    
    public String walk()
    {
        return "Sprints";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Carnivora", "Ailuridae", 
                "Allurus", "Red Panda"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Red Panda":
                super.getDesc();
                break;
            case "Allurus":
                super.getDescriptionAllurus();
                break;
            case "Ailuridae":
                super.getDescriptionAiluridae();
                break;
            case "Carnivora":
                super.getDescriptionCarnivora();
                break;
            case "Mammalia":
                super.getDescriptionMammalia();
                break;
            case "Chordata":
                super.getDescriptionChordata();
                break;
            case "Animalia":
                super.getDescriptionAnimalia();
                break;
            default:
                System.out.println("You flail helplessly with indecision.");
        }
    }
}