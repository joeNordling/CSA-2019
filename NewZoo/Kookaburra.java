public class Kookaburra extends Dacelo
{
    public Kookaburra(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise(){
        return "cries";
    }
    
    public String eat(){
        return "Mice, snakes, insects, small reptiles,";
    }
    
    public String fly(){
        return "Gracefully flaps wings";
    }
    
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Aves", "Coraciiformes", "Alcedinidae", 
                "Dacelo", "Kookaburra"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Kookaburra":
                super.getDesc();
                break;
            case "Dacelo":
                super.getDescriptionDacelo();
                break;
            case "Alcedinidae":
                super.getDescriptionAlcedinidae();
                break;
            case "Coraciiformes":
                super.getDescriptionCoraciiformes();
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
