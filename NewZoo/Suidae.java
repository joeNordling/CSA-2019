public abstract class Suidae extends Artiodactyla
{
    public Suidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Artiodactyla";
    }
    
    public void getDescriptionSuidae(){
        System.out.println("Suidae is a family of artiodactyl mammals which are commonly");
        System.out.println("called pigs, hogs or boars. In addition to numerous fossil species,");
        System.out.println("18 extant species are currently recognized (or 19 counting domestic");
        System.out.println("pigs and wild boars separately), classified into between four and eight genera.");
    }
}