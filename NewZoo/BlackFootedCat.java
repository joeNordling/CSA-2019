public class BlackFootedCat extends Felis
{
    public BlackFootedCat(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "purrs";
    }
    
    public String eat()
    {
        return "Rodents and small birds";
    }
    
    public String walk()
    {
        return "Sprints";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Carnivora", "Felidae", 
                "Felis", "Black Footed Cat"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Black Footed Cat":
                super.getDesc();
                break;
            case "Felis":
                super.getDescriptionFelis();
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