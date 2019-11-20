public class ChileanFlamingo extends Phoenicopterus
{
    public ChileanFlamingo(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise(){
        return "honks";
    }
    
    public String eat(){
        return "Mainly algae and plankton";
    }
    
    public String fly(){
        return "Gracefully flaps wings";
    }
    
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Aves", "Phoenicopteriformes", "Phoenicopteridae", 
                "Phoenicopterus", "Chilean Flamingo"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Chilean Flamingo":
                super.getDesc();
                break;
            case "Phoenicopterus":
                super.getDescriptionPhoenicopterus();
                break;
            case "Phoenicopteridae":
                super.getDescriptionPhoenicopteridae();
                break;
            case "Phoenicopteriformes":
                super.getDescriptionPhoenicopteriformes();
                break;
            case "Aves":
                super.getDescriptionAves();
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
