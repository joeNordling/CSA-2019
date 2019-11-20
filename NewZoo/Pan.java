public abstract class Pan extends Hominidae
{
    public Pan(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Hominidae";
    }
    
    public void getDescriptionPan(){
        System.out.println("The genus Pan consists of two extant species: the common chimpanzee");
        System.out.println("and the bonobo. Taxonomically, these two ape species are collectively");
        System.out.println("termed panins; however, both species are more commonly referred to");
        System.out.println("collectively using the generalized term chimpanzees, or chimps.");
        System.out.println("Together with humans, gorillas, and orangutans they are part of");
        System.out.println("the family Hominidae (the great apes, or hominids).");
    }
}