public abstract class Pygoscelis extends Scheniscidae
{
    public Pygoscelis(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Scheniscidae";
    }
    
    public void getDescriptionPygoscelis(){
        System.out.println("The genus Pygoscelis contains three living species of penguins");
        System.out.println("collectively known as 'brush-tailed penguins'.");
    }
}