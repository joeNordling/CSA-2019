public class Parrot extends Bird
{
    public Parrot()
    {
        super("Parrot","colorful and talkative");
    }
    @Override
    public String makeNoise()
    {
        return "Hello human";
    }
}
