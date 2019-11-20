public abstract class Cercopithecus extends Cercopithecidae
{
    public Cercopithecus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Cercopithercidae";
    }
    
    public void getDescriptionCercopithecus(){
        System.out.println("Not all members of this genus have the word 'guenon' in their");
        System.out.println("common names; also, because of changes in scientific classification,");
        System.out.println("some monkeys in other genera may have common names that include the");
        System.out.println("word 'guenon'. Nonetheless, the use of the term guenon for monkeys");
        System.out.println("of this genus is widely accepted. ");
    }
}