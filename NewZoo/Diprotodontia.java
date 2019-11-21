public abstract class Diprotodontia extends Mammalia
{
    public Diprotodontia(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Mammalia";
    }
    
    public void getDescriptionDiprotodontia(){
        System.out.println("Diprotodontia is an order of about 155 species of marsupial");
        System.out.println("mammals including the kangaroos, wallabies, possums, koala,");
        System.out.println("wombats, and many others. Extinct diprotodonts include the");
        System.out.println("rhinoceros-sized Diprotodon, and Thylacoleo, the so-called 'marsupial lion'.");
    }
}