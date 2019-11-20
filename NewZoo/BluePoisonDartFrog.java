public class BluePoisonDartFrog extends Dendrobates
{
    public BluePoisonDartFrog(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "croak";
    }
    
    public String eat()
    {
        return "Ants, beetles, flies, mites, spiders, termites, maggots, and caterpillars";
    }
    
    public String walk()
    {
        return "hops";
    }
    
    public String swim()
    {
        return "swims slowly";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Anura", "Dendrobatidae", 
                "Dendrobates", "Blue Poison Dart Frog"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Blue Poison Dart Frog":
                super.getDesc();
                break;
            case "Dendrobates":
                super.getDescriptionDendrobates();
                break;
            case "Dendrobatidae":
                super.getDescriptionDendrobatidae();
                break;
            case "Anura":
                super.getDescriptionAnura();
                break;
            case "Amphibian":
                super.getDescriptionAmphibian();
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