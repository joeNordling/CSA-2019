public class RainbowLorikeet extends Trichoglossus
{
    public RainbowLorikeet(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise(){
        return this.getName() + " wants a cracker";
    }
    
    public String eat(){
        return "Fruits, wild figs, unripe nuts, flower and leaf buds, and some seeds";
    }
    
    public String fly(){
        return "sits perched in a tree";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Aves", "Psittaciformes", "Psittaculidae", 
                "Trichoglossus", "Rainbow Lorikeet"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Rainbow Lorikeet":
                super.getDesc();
                break;
            case "Trichoglossus":
                super.getDescriptionTrichoglossus();
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
