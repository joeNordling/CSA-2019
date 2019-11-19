public class BatEaredFox extends Otocyon
{
    public BatEaredFox(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "growling";
    }
    
    public String eat()
    {
        return "beetles and their larvae, grasshoppers, scorpions, spiders, " +
               "millipedes, rodents, lizards, fruits, and eggs.";
    }
    
    public String walk()
    {
        return "Walks slowly";
    }
    
    public String fly() 
    {
        return "Hovers above your head";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Carnivora", "Canidae", 
                "Otocyon", "Bat Eared Fox"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Bat Eared Fox":
                super.getDesc();
                break;
            case "Otocyon":
                super.getDescriptionOtocyon();
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