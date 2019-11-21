public class BlackDwarfPorcupine extends Coendou
{
    public BlackDwarfPorcupine(String name, String desc)
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
        return new String[]{"Animalia", "Deuterostomia", "Tetrapoda", "Rodentia", "Erethizontidae", 
                "Coendou", "Black Dwarf Porcupine"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Black Dwarf Porcupine":
                super.getDesc();
                break;
            case "Coendou":
                super.getDescriptionCoendou();
                break;
            case "Erethizontidae":
                super.getDescriptionErethizontidae();
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
