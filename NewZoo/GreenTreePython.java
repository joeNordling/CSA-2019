public class GreenTreePython extends Morelia
{
    public GreenTreePython(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "Hisses";
    }
    
    public String eat()
    {
        return "Small mammals, rodents, geckos, skinks.";
    }
     
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Reptilia", "Squamata", "Pythonidae", 
                "Morelia", "Green Tree Python"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Green Tree Python":
                super.getDesc();
                break;
            case "Morelia":
                super.getDescriptionMorelia();
                break;
            case "Pythonidae":
                super.getDescriptionPythonidae();
                break;
            case "Squamata":
                super.getDescriptionSquamata();
                break;
            case "Reptilia":
                super.getDescriptionReptilia();
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