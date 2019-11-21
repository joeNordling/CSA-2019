public class RhinocerosHornbill extends Buceros
{
    public RhinocerosHornbill(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise(){
        return "a piercing cry";
    }
    
    public String eat(){
        return "Beetles and grasshoppers";
    }
    
    public String fly(){
        return "Sits perched on tree";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Aves", "Bucerotiformes", "Bucorvidae", 
                "Buceros", "Rhinoceros Hornbill"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Rhinoceros Hornbill":
                super.getDesc();
                break;
            case "Bucorvus":
                super.getDescriptionBuceros();
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
