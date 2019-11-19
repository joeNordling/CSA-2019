public class AfricanCrownedCrane extends Balearica
{
    public AfricanCrownedCrane(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise(){
        return "Honkes with a booming voice";
    }
    
    public String eat(){
        return "Plants, seeds, grain, insects, frogs, worms, " +
               "snakes, small fish and the eggs of aquatic animals.";
    }
    
    public String fly(){
        return "Swoops down over your head";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Aves", "Gruiformes", "Gruidae", 
                "Balearica", "African Crowned Crane"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "African Crowned Crane":
                super.getDesc();
                break;
            case "Balearica":
                super.getDescriptionBalearica();
                break;
            case "Gruidae":
                super.getDescriptionGruidae();
                break;
            case "Gruiformes":
                super.getDescriptionGruiformes();
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
