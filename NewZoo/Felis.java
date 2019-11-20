public abstract class Felis extends Felidae
{
    public Felis(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Felidae";
    }
    
    public void getDescriptionFelis(){
        System.out.println("Felis is a genus of small and medium-sized cat Felinae");
        System.out.println("species native to most of Africa and south of 60° latitude");
        System.out.println("in Europe and Asia to Indochina. The genus includes the");
        System.out.println("domestic cat. The smallest Felis species is the black-footed");
        System.out.println("cat with a head and body length from 38 to 42 cm (15 to 17 in).");
        System.out.println("The largest is the jungle cat with a head and body length from 62");
        System.out.println("to 76 cm (24 to 30 in).");
    }
}