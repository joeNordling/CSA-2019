public class Hippopotamus extends Hippopotaminae
{
    public Hippopotamus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "roar";
    }
    
    public String eat()
    {
        return "Grass";
    }
    
    public String walk()
    {
        return "Gallops";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Artiodactyla", "Hippopotamidae", 
                "Hippopotaminae", "Hippopotamus"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Hippopotamus":
                super.getDesc();
                break;
            case "Hippopotaminae":
                super.getDescriptionHippopotaminae();
                break;
            case "Hippopotamidae":
                super.getDescriptionHippopotamidae();
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