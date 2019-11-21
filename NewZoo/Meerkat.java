public class Meerkat extends Suricata
{
    public Meerkat(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "purring";
    }
    
    public String eat()
    {
        return "Lizards, snakes, scorpions, spiders, eggs, and small mammals.";
    }
    
    public String walk()
    {
        return "scurries";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Carnivora", "Herpestidae", 
                "Suricata", "Meerkat"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Meerkat":
                super.getDesc();
                break;
            case "Suricata":
                super.getDescriptionSuricata();
                break;
            case "Herpestidae":
                super.getDescriptionHerpestidae();
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