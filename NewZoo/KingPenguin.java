public class KingPenguin extends Aptenodytes
{
    public KingPenguin(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise(){
        return "Donkey honk";
    }
    
    public String eat(){
        return "Krill, fish, squid";
    }
    
    public String fly(){
        return "carelessly flaps wings";
    }
    
    public String swim(){
        return "streamlessly swims through the water";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Aves", "Sphenisciformes", "Scheniscidae", 
                "Aptenodytes", "King Penguin"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "King Penguin":
                super.getDesc();
                break;
            case "Aptenodytes":
                super.getDescriptionAptenodytes();
                break;
            case "Scheniscidae":
                super.getDescriptionScheniscidae();
                break;
            case "Sphenisciformes":
                super.getDescriptionSphenisciformes();
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
