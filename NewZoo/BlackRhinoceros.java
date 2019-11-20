public class BlackRhinoceros extends Diceros
{
    public BlackRhinoceros(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "roar";
    }
    
    public String eat()
    {
        return "Leafy plants, branches, shoots, thorny wood bushes, and fruit.";
    }
    
    public String walk()
    {
        return "charges";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Perissodactyla", "Rhinocerotidae", 
                "Diceros", "Black Rhinoceros"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Black Rhinoceros":
                super.getDesc();
                break;
            case "Diceros":
                super.getDescriptionDiceros();
                break;
            case "Rhinocerotidae":
                super.getDescriptionRhinocerotidae();
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