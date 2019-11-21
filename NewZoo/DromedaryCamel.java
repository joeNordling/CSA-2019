public class DromedaryCamel extends Camelus
{
    public DromedaryCamel(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "mmhrrr";
    }
    
    public String eat()
    {
        return "Foliage, dry grasses and desert vegetation";
    }
    
    public String walk()
    {
        return "trots";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Artiodactyla", "Camelidae", 
                "Camelus", "Dromedary Camel"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Dromedary Camel":
                super.getDesc();
                break;
            case "Camelus":
                super.getDescriptionCamelus();
                break;
            case "Camelidae":
                super.getDescriptionCamelidae();
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