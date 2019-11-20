public class GrantsZebra extends Equus
{
    public GrantsZebra(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "Neh";
    }
    
    public String eat()
    {
        return "Leafy plants, branches, grass.";
    }
    
    public String walk()
    {
        return "trots";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Perissodactyla", "Equidae", 
                "Equus", "Grants Zebra"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Grants Zebra":
                super.getDesc();
                break;
            case "Equus":
                super.getDescriptionEquus();
                break;
            case "Equidae":
                super.getDescriptionEquidae();
                break;
            case "Perissodactyla":
                super.getDescriptionPerissodactyla();
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