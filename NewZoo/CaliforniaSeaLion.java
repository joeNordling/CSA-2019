public class CaliforniaSeaLion extends Zalophus
{
    public CaliforniaSeaLion(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "Bark";
    }
    
    public String eat()
    {
        return "Penguin, Krill, Squid";
    }
    
    public String swim()
    {
        return "swims side to side";
    }
    
    public String walk()
    {
        return "Waddles";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Carnivora", "Otariidae", 
                "Zalophus", "California Sea Lion"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "California Sea Lion":
                super.getDesc();
                break;
            case "Zalophus":
                super.getDescriptionZalophus();
                break;
            case "Otariidae":
                super.getDescriptionOtariidae();
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