public class FrancoisLangur extends Trachypithecus
{
    public FrancoisLangur(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "grunts";
    }
    
    public String eat()
    {
        return "Leaves, fruits, seeds, flowers, stems, roots, bark,";
    }
    
    public String walk()
    {
        return "Climbs up trees";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Primates", "Cercopithecidae", 
                "Trachypithecus", "Francois Langur"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Francois Langur":
                super.getDesc();
                break;
            case "Trachypithecus":
                super.getDescriptionTrachypithecus();
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