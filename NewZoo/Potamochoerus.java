public abstract class Potamochoerus extends Suidae
{
    public Potamochoerus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Suidae";
    }
    
    public void getDescriptionPotamochoerus(){
        System.out.println("Potamochoerus is a genus in the pig family (Suidae). The two");
        System.out.println("species are restricted to sub-Saharan Africa, although the");
        System.out.println("bushpig, possibly due to introduction by man, also occurs in");
        System.out.println("Madagascar and nearby islands. ");
    }
}