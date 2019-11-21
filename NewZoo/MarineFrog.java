public class MarineFrog extends Rhinella
{
    public MarineFrog(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "ribbit";
    }
    
    public String eat()
    {
        return "Small rodents, reptiles, other amphibians, birds, and bats";
    }
    
    public String walk()
    {
        return "leep";
    }
    
    public String swim()
    {
        return "swims slowly";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Anura", "Bufonidae", 
                "Rhinella", "Marine Frog"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Marine Frog":
                super.getDesc();
                break;
            case "Rhinella":
                super.getDescriptionRhinella();
                break;
            case "Bufonidae":
                super.getDescriptionBufonidae();
                break;
            case "Anura":
                super.getDescriptionAnura();
                break;
            case "Amphibian":
                super.getDescriptionAmphibian();
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