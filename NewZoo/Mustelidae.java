public abstract class Mustelidae extends Carnivora
{
    public Mustelidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Carnivora";
    }
    
    public void getDescriptionMustelidae(){
        System.out.println("The Mustelidae are a family of carnivorous mammals, including");
        System.out.println("weasels, badgers, otters, ferrets, martens, minks, and wolverines,");
        System.out.println("among others. Mustelids are a diverse group and form the largest family");
        System.out.println("in the order Carnivora, suborder Caniformia. Mustelidae comprises about");
        System.out.println("56–60 species across eight subfamilies.");
    }
}