public class PrevostSquirrel extends Callosciurus
{
    public PrevostSquirrel(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "hiss";
    }
    
    public String eat()
    {
        return "Fruits, nuts, seeds, buds, flowers, insects and bird eggs";
    }
    
    public String walk()
    {
        return "runs";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Deuterostomia", "Tetrapoda", "Rodentia", "Sciuridae", 
                "Callosciurus", "Prevost Squirrel"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Prevost Squirrel":
                super.getDesc();
                break;
            case "Callosciurus":
                super.getDescriptionCallosciurus();
                break;
            case "Sciuridae":
                super.getDescriptionSciuridae();
                break;
            case "Rodentia":
                super.getDescriptionRodentia();
                break;
            case "Tetrapoda":
                super.getDescriptionTetrapoda();
                break;
            case "Deuterostomia":
                super.getDescriptionDeuterostomia();
                break;
            case "Animalia":
                super.getDescriptionAnimalia();
                break;
            default:
                System.out.println("You flail helplessly with indecision.");
        }
    }
}
