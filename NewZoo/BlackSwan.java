public class BlackSwan extends Cygnus
{
    public BlackSwan(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise(){
        return "honks aggresively";
    }
    
    public String eat(){
        return "Algae, typha, potamogeton, myriophyllum and ruppia";
    }
    
    public String fly(){
        return "Takes off to fly a short distance";
    }
    
    public String swim(){
        return "Gracefully glides across the water";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Aves", "Anseriformes", "Anatidae", 
                "Cygnus", "Black Swan"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Black Sawn":
                super.getDesc();
                break;
            case "Cygnus":
                super.getDescriptionCygnus();
                break;
            case "Anatidae":
                super.getDescriptionAnatidae();
                break;
            case "Anseriformes":
                super.getDescriptionAnseriformes();
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
