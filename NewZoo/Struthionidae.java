public abstract class Struthionidae extends Struthioniformes
{
    public Struthionidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Struthioniformes";
    }
    
    public void getDescriptionStruthionidae(){
        System.out.println("he two extant species of ostrich are the common ostrich and");
        System.out.println("Somali ostrich, both in the genus Struthio, which also contains");
        System.out.println("several species known from Holocene fossils such as the Asian");
        System.out.println("ostrich. The common ostrich is the more widespread of the two");
        System.out.println("living species, and is the largest living bird species.");
    }
}