public abstract class Trichoglossus extends Psittaculidae
{
    public Trichoglossus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Psittaculidae";
    }
    
    public void getDescriptionTrichoglossus(){
        System.out.println("Trichoglossus is a genus of lorikeet in the Psittaculidae or");
        System.out.println("true parrot superfamily. The genus is distributed widely through");
        System.out.println("Australia, Wallacea and Melanesia, with outliers in the");
        System.out.println("Philippines and Micronesia. Members of the genus are characterised");
        System.out.println("by barring, sometimes prominently, on the upper breast.");
    }
}