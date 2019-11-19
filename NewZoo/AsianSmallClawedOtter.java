public class AsianSmallClawedOtter extends Amblonyx
{
    public AsianSmallClawedOtter(String name, String desc)
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
                "Amblonyx", "Asian Small Clawed Otter"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Asian Small Clawed Otter":
                super.getDesc();
                break;
            case "Amblonyx":
                super.getDescriptionAmblonyx();
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