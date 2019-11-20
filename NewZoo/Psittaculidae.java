public abstract class Psittaculidae extends Psittaciformes
{
    public Psittaculidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Psittaciformes";
    }
    
    public void getDescriptionPsittaculidae(){
        System.out.println("The parrot family Psittaculidae consists of five subfamilies,");
        System.out.println("Agapornithinae, Loriinae, Platycercinae, Psittacellinae and Psittaculinae.");
    }
}