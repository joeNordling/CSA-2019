public class MactschieTreeKangaroo extends Dendrolagus
{
    public MactschieTreeKangaroo(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "Soft clucking";
    }
    
    public String eat()
    {
        return "Leaves, sap, insects, flowers, and nuts.";
    }
    
    public String walk()
    {
        return "hops";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Diprotodontia", "Macropodidae", 
                "Dendrolagus", "Mactschie Tree Kangaroo"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Mactschie Tree Kangaroo":
                super.getDesc();
                break;
            case "Dendrolagus":
                super.getDescriptionDendrolagus();
                break;
            case "Macropodidae":
                super.getDescriptionMacropodidae();
                break;
            case "Diprotodontia":
                super.getDescriptionDiprotodontia();
                break;
            case "Mammalia":
                super.getDescriptionMammalia();
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