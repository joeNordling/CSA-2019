public abstract class Giraffidae extends Artiodactyla
{
    public Giraffidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Artiodactyla";
    }
    
    public void getDescriptionGiraffidae(){
        System.out.println("Giraffidae are a family of ruminant artiodactyl mammals that");
        System.out.println("share a common ancestor with cervids and bovids. This family,");
        System.out.println("once a diverse group spread throughout Eurasia and Africa,");
        System.out.println("presently comprises only two extant genera, the giraffe");
        System.out.println("and the okapi (the only known species of Okapia).");
    }
}