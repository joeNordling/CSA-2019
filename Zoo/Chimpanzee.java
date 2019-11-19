public class Chimpanzee extends Primate
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class Orangutan
     */
    public Chimpanzee()
    {
        super("Chimpanzee", "brown and sometimes mean");
        this.age = "very young";
    }
    @Override
        public String makeNoise()
    {
        // put your code here
        return "screetches and throws feces.";
    }
}