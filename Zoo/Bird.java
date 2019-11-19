public class Bird extends Animal implements Walking,Flying
{
    public Bird()
    {
        super("Bird", "a flying fethered animal");

    } 
    public Bird(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "chirp";
    }
    public String eat()
    {
        return "seeds";
    }
    public String walk() {return "hops";}
    public String fly() {return "Fly";}
}
