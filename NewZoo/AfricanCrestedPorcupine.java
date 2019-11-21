public class AfricanCrestedPorcupine extends Hystrix
{
    public AfricanCrestedPorcupine(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "rattle-hissing noise";
    }
    
    public String eat()
    {
        return "roots";
    }
    
    public String walk()
    {
        return "runs, walks, and rolls";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Deuterostomia", "Tetrapoda", "Rodentia", "Hystricidae", 
                "Hystrix", "African Crested Porcupine"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "African Crested Porcupine":
                super.getDesc();
                break;
            case "Hystrix":
                super.getDescriptionHystrix();
                break;
            case "Hystricidae":
                super.getDescriptionHystricidae();
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
