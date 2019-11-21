public class LappetFacedVulture extends Torgos
{
    public LappetFacedVulture(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise(){
        return "Lets out the loud cry of an eagle";
    }
    
    public String eat(){
        return "Animal carcasses";
    }
    
    public String fly(){
        return "Circles above your head";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Aves", "Accipitriformes", "Accipitridae", 
                "Torgos", "Lappet Faced Vulture"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Lappet Faced Vulture":
                super.getDesc();
                break;
            case "Torgos":
                super.getDescriptionTorgos();
                break;
            case "Accipitridae":
                super.getDescriptionAccipitridae();
                break;
            case "Accipitriformes":
                super.getDescriptionAccipitriformes();
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
