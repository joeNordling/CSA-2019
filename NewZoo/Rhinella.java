public abstract class Rhinella extends Bufonidae
{
    public Rhinella(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Bufonidae";
    }
    
    public void getDescriptionRhinella(){
        System.out.println("Rhinella, commonly known as South American toads, beaked toads");
        System.out.println("or Rio Viejo toads, is a genus of true toads native to neotropical");
        System.out.println("Central and South America. Originally, all species of the genus");
        System.out.println("Rhinella were included in the genus Bufo, then they were split into");
        System.out.println("the genera Chaunus and Rhamphophryne.");
    }
}