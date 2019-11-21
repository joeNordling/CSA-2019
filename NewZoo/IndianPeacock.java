public class IndianPeacock extends Pavo
{
    public IndianPeacock(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise(){
        return "hums";
    }
    
    public String eat(){
        return "Berries";
    }
    
    public String fly(){
        return "attemps to fly";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Aves", "Galliformes", "Phasianidae", 
                "Pavo", "Indian Peacock"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Indian Peacock":
                super.getDesc();
                break;
            case "Pavo":
                super.getDescriptionPavo();
                break;
            case "Phasianidae":
                super.getDescriptionPhasianidae();
                break;
            case "Galliformes":
                super.getDescriptionGalliformes();
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
