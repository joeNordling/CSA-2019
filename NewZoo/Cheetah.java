public class Cheetah extends Acinonyx
{
    public Cheetah(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "A growl can be heard";
    }
    
    public String eat()
    {
        return "Sntelopes, buffaloes, zebras, young elephants, rhinos, hippos," +
               "wild hogs, crocodiles and giraffes";
    }
    
    public String walk()
    {
        return "Sprints";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Carnivora", "Felidae", 
                "Acinonyx", "Cheetah"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Cheetah":
                super.getDesc();
                break;
            case "Acinonyx":
                super.getDescriptionAcinonyx();
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