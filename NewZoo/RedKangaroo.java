public class RedKangaroo extends Macropus
{
    public RedKangaroo(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "honks";
    }
    
    public String eat()
    {
        return "Grasses";
    }
    
    public String walk()
    {
        return "jumps";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Diprotodontia", "Macropodidae", 
                "Macropus", "Red Kangaroo"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Red Kangaroo":
                super.getDesc();
                break;
            case "Macropus":
                super.getDescriptionMacropus();
                break;
            case "Macropodidae":
                super.getDescriptionMacropodidae();
                break;
            case "Diprotodontia":
                super.getDescriptionDiprotodontia();
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