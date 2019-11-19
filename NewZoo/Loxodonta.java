public abstract class Loxodonta extends Elephantidae
{
    public Loxodonta(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Elephantidae";
    }
    
    public void getDescriptionLoxodonta(){
        System.out.println("The Loxodonta is a genus comprising two living");
        System.out.println("elephant species, the African bush elephant");
        System.out.println("and the smaller African forest elephant. Both are");
        System.out.println("herbivores and live in groups. They have grey skin and"); 
        System.out.println("differ in the size of their ears and tusks, and in the");
        System.out.println("shape and size of their skulls.");
    }
}