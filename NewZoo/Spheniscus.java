public abstract class Spheniscus extends Scheniscidae
{
    public Spheniscus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Scheniscidae";
    }
    
    public void getDescriptionSpheniscus(){
        System.out.println("There are four living species of penguins known as Speniscus");
        System.out.println("and all have similar coloration. They are sometimes");
        System.out.println("also known as 'jack-ass penguins' due to their loud locator");
        System.out.println("calls sounding similar to a donkey braying.");
    }
}