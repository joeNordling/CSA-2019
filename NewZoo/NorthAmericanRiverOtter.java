public class NorthAmericanRiverOtter extends Lontra
{
    public NorthAmericanRiverOtter(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "a small begging call";
    }
    
    public String eat()
    {
        return "Crabs, other crustaceans, molluscs and some fish, " + 
               "although they will occasionally eat frogs, small mammals, snakes and insects.";
    }
    
    public String walk()
    {
        return "Sprints";
    }
    
    public String swim()
    {
        return "Swims on its back almost at ease";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Carnivora", "Mustelidae", 
                "Amblonyx", "North American River Otter"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "North American River Otter":
                super.getDesc();
                break;
            case "Lontra":
                super.getDescriptionLontra();
                break;
            case "Mustelidae":
                super.getDescriptionMustelidae();
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