public class GentooPengion extends Pygoscelis
{
    public GentooPengion(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise(){
        return "A ear-piercing screech can be heard";
    }
    
    public String eat(){
        return "Krill, fish";
    }
    
    public String fly(){
        return "carelessly flaps wings";
    }
    
    public String swim(){
        return "streamlessly swims through the water";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Aves", "Sphenisciformes", "Scheniscidae", 
                "Pygoscelis", "Gentoo Pengion"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Gentoo Pengion":
                super.getDesc();
                break;
            case "Pygoscelis":
                super.getDescriptionPygoscelis();
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
