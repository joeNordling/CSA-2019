public abstract class Lycaon extends Canidae
{
    public Lycaon(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Canidae";
    }
    
    public void getDescriptionLycaon(){
        System.out.println("Lycaon is a genus of canid. There are two known species:");
        System.out.println("the extant Lycaon pictus, a canid commonly called 'African wild dog'");
        System.out.println("'painted dog', 'ornate wolf', or 'African hunting dog', among others;");
        System.out.println("and the extinct, less cursorial Lycaon sekowei, known from the Pliocene");
        System.out.println("and Pleistocene of South Africa.");
    }
}