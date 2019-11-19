public abstract class Carnivora extends Mammalia
{
    public Carnivora(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Mammalia";
    }
    
    public void getDescriptionCarnivora(){
        System.out.println("Carnivora is a diverse scrotiferan order that ");
        System.out.println("includes over 280 species of placental mammals.");
        System.out.println("Its members are formally referred to as carnivorans,");
        System.out.println("whereas the word 'carnivore' can refer to any meat-eating organism.");
    }
}