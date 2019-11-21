public class Llama extends Lama
{
    public Llama(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "spits";
    }
    
    public String eat()
    {
        return "Fed grains, herbivore pellets and grass hay";
    }
    
    public String walk()
    {
        return "trots";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Mammalia", "Artiodactyla", "Camelidae", 
                "Lama", "Llama"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Llama":
                super.getDesc();
                break;
            case "Lama":
                super.getDescriptionLama();
                break;
            case "Camelidae":
                super.getDescriptionCamelidae();
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