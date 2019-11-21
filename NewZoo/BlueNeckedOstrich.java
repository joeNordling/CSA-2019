public class BlueNeckedOstrich extends Struthio
{
    public BlueNeckedOstrich(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise(){
        return "honks";
    }
    
    public String eat(){
        return "Roots, leaves, and seeds";
    }
    
    public String fly(){
        return "Hopelessly flaps wings";
    }
    
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Aves", "Struthioniformes", "Struthionidae", 
                "Struthio", "BlueNeckedOstrich"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "BlueNeckedOstrich":
                super.getDesc();
                break;
            case "Struthio":
                super.getDescriptionStruthio();
                break;
            case "Struthionidae":
                super.getDescriptionStruthionidae();
                break;
            case "Struthioniformes":
                super.getDescriptionStruthioniformes();
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
