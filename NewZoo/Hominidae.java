public abstract class Hominidae extends Primates
{
    public Hominidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Primates";
    }
    
    public void getDescriptionHominidae(){
        System.out.println("The Hominidae, whose members are known as great apes or hominids, are a taxonomic");
        System.out.println("family of primates that includes eight extant species in four genera: Pongo, the");
        System.out.println("Bornean, Sumatran and Tapanuli orangutan; Gorilla, the eastern and western gorilla;");
        System.out.println("Pan, the common chimpanzee and the bonobo; and Homo, of whom only modern humans remain,");
        System.out.println("with several extinct relatives (e.g., the Neanderthal) and ancestors, such as Homo erectus.");
    }
}