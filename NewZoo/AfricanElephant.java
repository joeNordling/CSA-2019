public class AfricanElephant extends Loxodonta
{
    public AfricanElephant(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "A loud cry from the trunk of the elephant shakes the ground";
    }
    
    public String eat()
    {
        return "Grasses, creepers, herbs, leaves and bark.";
    }
    
    public String walk()
    {
        return "runs and walks";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Proboscidea", "Elephantidae", 
                "Loxodonta", "African Elephant"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "African Elephant":
                super.getDesc();
                break;
            case "Loxodonta":
                super.getDescriptionLoxodonta();
                break;
            case "Elephantidae":
                super.getDescriptionElephantidae();
                break;
            case "Proboscidea":
                super.getDescriptionProboscidea();
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