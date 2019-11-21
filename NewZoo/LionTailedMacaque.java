public class LionTailedMacaque extends Macaca
{
    public LionTailedMacaque(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "hollars";
    }
    
    public String eat()
    {
        return "Fruits, seeds, shoots, pith, flowers, cones, and  mesocarp";
    }
    
    public String walk()
    {
        return "Climbs up trees";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Primates", "Cercopithecidae", 
                "Macacaecus", "Lion Tailed Macaque"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Lion Tailed Macaque":
                super.getDesc();
                break;
            case "Macaca":
                super.getDescriptionMacaca();
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