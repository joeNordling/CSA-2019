public class GuineaBaboon extends Papio
{
    public GuineaBaboon(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "screams";
    }
    
    public String eat()
    {
        return "Fruits, roots, and tubers, seeds, and leaves";
    }
    
    public String walk()
    {
        return "Climbs up trees";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Primates", "Cercopithecidae", 
                "Papio", "Guinea Baboon"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Guinea Baboon":
                super.getDesc();
                break;
            case "Papio":
                super.getDescriptionPapio();
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