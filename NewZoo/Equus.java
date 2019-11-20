public abstract class Equus extends Equidae
{
    public Equus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Equidae";
    }
    
    public void getDescriptionEquus(){
        System.out.println("Equus is a genus of mammals in the family Equidae, which includes");
        System.out.println("horses, donkeys, and zebras. Within Equidae, Equus is the only");
        System.out.println("recognized extant genus, comprising seven living species. The term");
        System.out.println("equine refers to any member of this genus, including horses.");
    }
}