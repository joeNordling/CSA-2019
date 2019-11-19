public class AmurLeopard extends Panthera
{
    public AmurLeopard(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "the leopard makes no noise";
    }
    
    public String eat()
    {
        return "Roe and sika deer, hares, wild pigs and badgers";
    }
    
    public String walk()
    {
        return "Sprints";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Carnivora", "Felidae", 
                "Panthera", "Amur Leopard"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Amur Leopard":
                super.getDesc();
                break;
            case "Panthera":
                super.getDescriptionPanthera();
                break;
            case "Felidae":
                super.getDescriptionFelidae();
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