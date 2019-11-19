public class BoreanOrangutan extends Pongo
{
    public BoreanOrangutan(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "Growl and Howl";
    }
    
    public String eat()
    {
        return "Wild figs, durians leaves, seeds, bird eggs, flowers, honey, insects";
    }
    
    public String walk()
    {
        return "Climbs up trees";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Primates", "Hominidae", 
                "Pongo", "Borean Orangutan"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "BoreanOrangutan":
                super.getDesc();
                break;
            case "Pongo":
                super.getDescriptionPongo();
                break;
            case "Hominidae":
                super.getDescriptionHominidae();
                break;
            case "Primates":
                super.getDescriptionPrimates();
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