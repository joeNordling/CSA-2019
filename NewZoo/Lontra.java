public abstract class Lontra extends Mustelidae implements Swimming
{
    public Lontra(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Mustelidae";
    }
    
    public void getDescriptionLontra(){
        System.out.println("Lontra is a genus of otters from the Americas.");
    }
}