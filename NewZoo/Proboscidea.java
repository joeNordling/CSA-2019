public abstract class Proboscidea extends Mammalia
{
    public Proboscidea(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Mammalia";
    }
    
    public void getDescriptionProboscidea(){
        System.out.println("The Proboscidea are a taxonomic order");
        System.out.println("of afrotherian mammals containing one living");
        System.out.println("family and several extinct families.");
        System.out.println("This order, first described by J. Illiger in 1811,");
        System.out.println("encompasses the trunked mammals.");
    }
}