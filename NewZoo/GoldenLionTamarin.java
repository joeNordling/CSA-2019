public class GoldenLionTamarin extends Leontopithecus
{
    public GoldenLionTamarin(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "crys";
    }
    
    public String eat()
    {
        return "Fruits, flowers, nectar, bird eggs, insects and small vertebrates.";
    }
    
    public String walk()
    {
        return "Climbs up trees";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Primates", "Callitrichidae", 
                "Leontopithecus", "Golden Lion Tamarin"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Golden Lion Tamarin":
                super.getDesc();
                break;
            case "Leontopithecus":
                super.getDescriptionLeontopithecus();
                break;
            case "Callitrichidae":
                super.getDescriptionCallitrichidae();
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