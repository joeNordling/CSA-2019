public class Chimpanzee extends Pan
{
    public Chimpanzee(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "Hoot";
    }
    
    public String eat()
    {
        return "Fruit, leaves, leaf buds, seeds, blossoms, stems, pith, bark and resin.";
    }
    
    public String walk()
    {
        return "Climbs up trees";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Primates", "Hominidae", 
                "Pan", "Chimpanzee"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Chimpanzee":
                super.getDesc();
                break;
            case "Pan":
                super.getDescriptionPan();
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