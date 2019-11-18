public abstract class Gruiformes extends Aves
{
    public Gruiformes(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Aves";
    }
    
    public void getDescriptionGruiformes(){
        System.out.println("The Gruiformes are an order containing a");
        System.out.println("considerable number of living and extinct");
        System.out.println("bird families, with a widespread geographical");
        System.out.println("diversity. Gruiform means 'crane-like'.");
    }
}