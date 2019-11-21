public class MasaiGiraffe extends Giraffa
{
    public MasaiGiraffe(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "snorts";
    }
    
    public String eat()
    {
        return "Leaves, twigs, sprouts, flowers, fruits and bark";
    }
    
    public String walk()
    {
        return "Trots";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Artiodactyla", "Giraffidae", 
                "Giraffa", "Masai Giraffe"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Masai Giraffe":
                super.getDesc();
                break;
            case "Giraffa":
                super.getDescriptionGiraffa();
                break;
            case "Giraffidae":
                super.getDescriptionGiraffidae();
                break;
            case "Artiodactyla":
                super.getDescriptionArtiodactyla();
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