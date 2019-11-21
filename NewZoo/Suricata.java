public abstract class Suricata extends Herpestidae
{
    public Suricata(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Herpestidae";
    }
    
    public void getDescriptionSuricata(){
        System.out.println("A group of meerkats is called a 'mob', 'gang' or 'clan'.");
        System.out.println("A meerkat clan often contains about 20 meerkats, but some");
        System.out.println("super-families have 50 or more members. In captivity, meerkats");
        System.out.println("have an average life span of 12–14 years, and about 6–7 years in the wild.");
    }
}