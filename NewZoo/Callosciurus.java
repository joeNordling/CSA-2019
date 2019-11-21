public abstract class Callosciurus extends Sciuridae
{
    public Callosciurus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Sciuridae";  
    }
    
    public void getDescriptionCallosciurus(){
        System.out.println("Callosciurus is a genus of squirrels collectively referred");
        System.out.println("to as the 'beautiful squirrels'. They are found mainly in");
        System.out.println("Southeast Asia, though a few species also occur in Nepal,");
        System.out.println("northeastern India, Bangladesh and southern China.");
    }
}
