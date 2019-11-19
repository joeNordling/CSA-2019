public abstract class Amblonyx extends Mustelidae implements Swimming
{
    public Amblonyx(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Mustelidae";
    }
    
    public void getDescriptionAmblonyx(){
        System.out.println("The Asian small-clawed otter, also known as the oriental");
        System.out.println("small-clawed otter or simply small-clawed otter, is a");
        System.out.println("semiaquatic mammal native to South and Southeast Asia.");
    }
}