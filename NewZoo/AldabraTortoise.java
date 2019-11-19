public class AldabraTortoise extends Aldabrachelys
{
    public AldabraTortoise(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "A small grunt";
    }
    
    public String eat()
    {
        return "Grass, leaves, plants, stems and other tasty weeds.";
    }
    
    public String swim()
    {
        return "Swims slowly through the water";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Reptilia", "Testudines", "Testudinidae", 
                "Aldabrachelys", "Aldabra Tortoise"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Aldabra Tortoise":
                super.getDesc();
                break;
            case "Aldabrachelys":
                super.getDescriptionAldabrachelys();
                break;
            case "Testudinidae":
                super.getDescriptionTestudinidae();
                break;
            case "Testudines":
                super.getDescriptionTestudines();
                break;
            case "Reptilia":
                super.getDescriptionReptilia();
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