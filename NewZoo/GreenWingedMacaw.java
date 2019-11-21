public class GreenWingedMacaw extends Ara
{
    public GreenWingedMacaw(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise(){
        return "Crows";
    }
    
    public String eat(){
        return "Fruits, wild figs, unripe nuts, flower and leaf buds, and some seeds";
    }
    
    public String fly(){
        return "sits perched in a tree";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Aves", "Psittaciformes", "Psittaculidae", 
                "Ara", "Green Winged Macaw"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Green Winged Macaw":
                super.getDesc();
                break;
            case "Ara":
                super.getDescriptionAra();
                break;
            case "Psittaculidae":
                super.getDescriptionPsittaculidae();
                break;
            case "Psittaciformes":
                super.getDescriptionPsittaciformes();
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
