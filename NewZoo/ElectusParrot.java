public class ElectusParrot extends Eclectus
{
    public ElectusParrot(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise(){
        return super.getName() + " wants a cracker";
    }
    
    public String eat(){
        return "Fruits, wild figs, unripe nuts, flower and leaf buds, and some seeds";
    }
    
    public String fly(){
        return "flies down to head level";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Aves", "Psittaciformes", "Psittaculidae", 
                "Eclectus", "Electus Parrot"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Electus Parrot":
                super.getDesc();
                break;
            case "Eclectus":
                super.getDescriptionEclectus();
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
