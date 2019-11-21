public class Polarbear extends Ursus
{
    public Polarbear(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "growls";
    }
    
    public String eat()
    {
        return "Roe and sika deer, hares, wild pigs and badgers";
    }
    
    public String walk()
    {
        return "Sprints";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Carnivora", "Ursidae", 
                "Ursus", "Polar bear"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Polar bear":
                super.getDesc();
                break;
            case "Ursus":
                super.getDescriptionUrsus();
                break;
            case "Ursidae":
                super.getDescriptionUrsidae();
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