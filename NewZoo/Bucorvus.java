public abstract class Bucorvus extends Bucorvidae
{
    public Bucorvus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Bucorvidae";
    }
    
    public void getDescriptionBucorvus(){
        System.out.println("The Bucorvus is a Genus of an African bird, found north of the equator,");
        System.out.println("and is one of two species of ground hornbill. The other is the slightly");
        System.out.println("larger southern ground hornbill; the two are the largest species of hornbills");
        System.out.println("found in Africa."); 
    }
}