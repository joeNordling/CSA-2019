public class MonaMonkey extends Cercopithecus
{
    public MonaMonkey(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "hoot";
    }
    
    public String eat()
    {
        return "Fruits, figs, insects, leaves, twigs, and flowers";
    }
    
    public String walk()
    {
        return "Climbs up trees";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Primates", "Cercopithecidae", 
                "Cercopithecus", "Mona Monkey"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Mona Monkey":
                super.getDesc();
                break;
            case "Cercopithecus":
                super.getDescriptionCercopithecus();
                break;
            case "Cercopithecidae":
                super.getDescriptionCercopithecidae();
                break;
            case "Primates":
                super.getDescriptionPrimates();
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