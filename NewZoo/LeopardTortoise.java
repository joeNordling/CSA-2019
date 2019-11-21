public class LeopardTortoise extends Stigmochelys
{
    public LeopardTortoise(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "A slight grunt";
    }
    
    public String eat()
    {
        return "Forbs, thistles, grasses, and succulents.";
    }
    
    public String swim()
    {
        return "Swims slowly through the water";
    }
    
    public String[] getParents(){
        return new String[]{"Animalia", "Chordata", "Reptilia", "Testudines", "Testudinidae", 
                "Stigmochelys", "Leopard Tortoise"};  
    }
    
    public void getDescription(String statement){
        switch(statement) {
            case "Leopard Tortoise":
                super.getDesc();
                break;
            case "Stigmochelys":
                super.getDescriptionStigmochelys();
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