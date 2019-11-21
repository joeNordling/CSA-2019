public class RedRiverHog extends Potamochoerus
{
    public RedRiverHog(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "snorts";
    }
    
    public String eat()
    {
        return "Roots and tubers,";
    }
    
    public String walk()
    {
        return "Trots";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Artiodactyla", "Suidae", 
                "Potamochoerus", "Red River Hog"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Red River Hog":
                super.getDesc();
                break;
            case "Potamochoerus":
                super.getDescriptionPotamochoerus();
                break;
            case "Suidae":
                super.getDescriptionSuidae();
                break;
            case "Artiodactyla":
                super.getDescriptionArtiodactyla();
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