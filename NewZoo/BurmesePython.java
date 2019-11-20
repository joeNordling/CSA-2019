public class BurmesePython extends Python
{
    public BurmesePython(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "Hisses";
    }
    
    public String eat()
    {
        return "Birds and mammals";
    }
     
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Reptilia", "Squamata", "Pythonidae", 
                "Python", "Burmese Python"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Burmese Python":
                super.getDesc();
                break;
            case "Python":
                super.getDescriptionPython();
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