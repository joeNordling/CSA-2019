public class RedCappedMangabey extends Cercopithecus
{
    public RedCappedMangabey(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "hoots";
    }
    
    public String eat()
    {
        return "Fruits, figs";
    }
    
    public String walk()
    {
        return "Climbs up trees";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Primates", "Cercopithecidae", 
                "Cercopithecus", "Red Capped Mangabey"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Red Capped Mangabey":
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