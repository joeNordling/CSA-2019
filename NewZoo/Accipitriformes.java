public abstract class Accipitriformes extends Aves
{
    public Accipitriformes(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Aves";
    }
    
    public void getDescriptionAccipitriformes(){
        System.out.println("The Accipitriformes are an order of birds");
        System.out.println("that includes most of the diurnal birds of prey");
        System.out.println("– including hawks, eagles, and kites, but not falcons.");
    }
}