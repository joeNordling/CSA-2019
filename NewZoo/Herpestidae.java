public abstract class Herpestidae extends Carnivora
{
    public Herpestidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Carnivora";
    }
    
    public void getDescriptionHerpestidae(){
        System.out.println("They are small carnivorans native to southern Eurasia and");
        System.out.println("mainland Africa. The remaining species of this family are");
        System.out.println("native to Africa and comprise four kusimanses in the genus");
        System.out.println("Crossarchus, and the meerkat Suricata suricatta.");
    }
}