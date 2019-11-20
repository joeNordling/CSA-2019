public abstract class Aptenodytes extends Scheniscidae
{
    public Aptenodytes(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Scheniscidae";
    }
    
    public void getDescriptionAptenodytes(){
        System.out.println("The genus Aptenodytes contains two extant species of penguins collectively");
        System.out.println("known as 'the great penguins'.");
    }
}