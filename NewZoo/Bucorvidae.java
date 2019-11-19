public abstract class Bucorvidae extends Bucerotiformes
{
    public Bucorvidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Bucerotiformes";
    }
    
    public void getDescriptionBucorvidae(){
        System.out.println("The Bucorvidae are a family of the order Bucerotiformes,");
        System.out.println("with a single genus Bucorvus and two extant species. The");
        System.out.println("family is endemic to sub-Saharan Africa: the Abyssinian");
        System.out.println("ground hornbill occurs in a belt from Senegal east to Ethiopia,");
        System.out.println("and the southern ground hornbill occurs in southern and East Africa."); 
    }
}