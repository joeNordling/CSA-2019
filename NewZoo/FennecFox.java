public class FennecFox extends Vulpes
{
    public FennecFox(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "cry";
    }
    
    public String eat()
    {
        return "Rodents, insects, birds, eggs, and rabbits.";
    }
    
    public String walk()
    {
        return "Trots along the grass";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Carnivora", "Canidae", 
                "Vulpes", "Fennec Fox"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Fennec Fox":
                super.getDesc();
                break;
            case "Vulpes":
                super.getDescriptionVulpes();
                break;
            case "Canidae":
                super.getDescriptionCanidae();
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