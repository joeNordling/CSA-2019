public abstract class Accipitridae extends Accipitriformes
{
    public Accipitridae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Accipitrifomes";
    }
    
    public void getDescriptionAccipitridae(){
        System.out.println("The Accipitridae are a family of small to large");
        System.out.println("birds with strongly hooked bills and variable morphology based on diet.");
    }
}
