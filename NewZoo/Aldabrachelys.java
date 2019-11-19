public abstract class Aldabrachelys extends Testudinidae
{
    public Aldabrachelys(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Testudinidae";
    }
    
    public void getDescriptionAldabrachelys(){
        System.out.println("Aldabrachelys is the recognised genus for the Seychelles and Madagascan");
        System.out.println("radiations of giant tortoises, including the Aldabra giant tortoise");
        System.out.println("(Aldabrachelys gigantea)."); 
    }
}
