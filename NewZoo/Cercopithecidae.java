public abstract class Cercopithecidae extends Primates
{
    public Cercopithecidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Primates";
    }
    
    public void getDescriptionCercopithecidae(){
        System.out.println("wenty-four genera and 138 species are recognized, making it");
        System.out.println("the largest primate family. Old World monkey genera include");
        System.out.println("baboons and macaques. Common names for other Old World monkeys");
        System.out.println("include the talapoin, guenon, colobus, douc, vervet, gelada,");
        System.out.println("mangabey, langur, mandrill, surili, patas, and proboscis monkey.");
    }
}