public abstract class Leontopithecus extends Callitrichidae
{
    public Leontopithecus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Callitrichidae";
    }
    
    public void getDescriptionLeontopithecus(){
        System.out.println("The four species of lion tamarins make up the genus Leontopithecus.");
        System.out.println("They are small New World monkeys named for the mane surrounding their");
        System.out.println("face, similar to the mane of a lion.");
    }
}