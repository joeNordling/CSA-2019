public class AfricanLion extends Panthera
{
    public AfricanLion(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "Roars as the king of the jungle";
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
                "Panthera", "African Lion"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "African Lion":
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