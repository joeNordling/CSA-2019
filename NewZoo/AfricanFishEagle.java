public class AfricanFishEagle extends Haliaeetus
{
    public AfricanFishEagle(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise(){
        return "Lets out the loud cry of an eagle";
    }
    
    public String eat(){
        return "Fish";
    }
    
    public String fly(){
        return "Circles above your head";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Aves", "Accipitriformes", "Accipitridae", 
                "Haliaeetus", "African Fish Eagle"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "African Fish Eagle":
                super.getDesc();
                break;
            case "Haliaeetus":
                super.getDescriptionHaliaeetus();
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
