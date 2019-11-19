public class CaracalCaracal extends Caracal
{
    public CaracalCaracal(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "purrs";
    }
    
    public String eat()
    {
        return "Small mammals, birds, and rodents";
    }
    
    public String walk()
    {
        return "Waddle";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Carnivora", "Felidae", 
                "Caracal", "Caracal Caracal"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Caracal Caraca":
                super.getDesc();
                break;
            case "Caracal":
                super.getDescriptionCaracal();
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