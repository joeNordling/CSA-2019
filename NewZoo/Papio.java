public abstract class Papio extends Cercopithecidae
{
    public Papio(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Cercopithercidae";
    }
    
    public void getDescriptionPapio(){
        System.out.println("The common names of the five species of baboons are");
        System.out.println("the hamadryas, the Guinea, the olive, the yellow,");
        System.out.println("and the chacma baboons. They are each native to one");
        System.out.println("of five specific areas of Africa, and the hamadryas");
        System.out.println("baboon is also native to part of the Arabian Peninsula.");
        System.out.println("They are among the largest non-hominoid primates. Baboons");
        System.out.println("have existed for at least two million years.");
    }
}