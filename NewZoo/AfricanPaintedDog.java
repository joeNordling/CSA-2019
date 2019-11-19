public class AfricanPaintedDog extends Lycaon
{
    public AfricanPaintedDog(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "growling and hissing";
    }
    
    public String eat()
    {
        return "Rodents, Lizards, Birds and Insects";
    }
    
    public String walk()
    {
        return "Stalks prey by slowly crawling";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Carnivora", "Canidae", 
                "Lycaon", "African Painted Dog"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "African Painted Dog":
                super.getDesc();
                break;
            case "Lycaon":
                super.getDescriptionLycaon();
                break;
            case "Canidae":
                super.getDescriptionCanidae();
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