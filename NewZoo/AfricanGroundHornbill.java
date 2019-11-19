public class AfricanGroundHornbill extends Bucorvus
{
    public AfricanGroundHornbill(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise(){
        return "A small grunt can be heard";
    }
    
    public String eat(){
        return "Beetles and grasshoppers";
    }
    
    public String fly(){
        return "Circles above your head";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Aves", "Bucerotiformes", "Bucorvidae", 
                "Bucorvus", "African Ground Hornbill"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "African Ground Hornbill":
                super.getDesc();
                break;
            case "Bucorvus":
                super.getDescriptionBucorvus();
                break;
            case "Bucorvidae":
                super.getDescriptionBucorvidae();
                break;
            case "Bucerotiformes":
                super.getDescriptionBucerotiformes();
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
