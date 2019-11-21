public class ParmaWallaby extends Macropus
{
    public ParmaWallaby(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "Hissing";
    }
    
    public String eat()
    {
        return "Grasses, herbs, leaves, and the bark of trees and shrubs.";
    }
    
    public String walk()
    {
        return "crawls";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Diprotodontia", "Macropodidae", 
                "Macropus", "Parma Wallaby"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Parma Wallaby":
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