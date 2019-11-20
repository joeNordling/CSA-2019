public class Bongo extends Tragelaphus
{
    public Bongo(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "groan";
    }
    
    public String eat()
    {
        return "Leaves, bushes, vines, bark and pith of rotting trees, grasses/herbs, roots, cereals, and fruits";
    }
    
    public String walk()
    {
        return "Gallops";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Artiodactyla", "Bovidae", 
                "Tragelaphus", "Bongo"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Bongo":
                super.getDesc();
                break;
            case "Tragelaphus":
                super.getDescriptionTragelaphus();
                break;
            case "Bovidae":
                super.getDescriptionBovidae();
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