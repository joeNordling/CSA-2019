public abstract class Alcedinidae extends Coraciiformes
{
    public Alcedinidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Coraciiformes";
    }
    
    public void getDescriptionAlcedinidae(){
        System.out.println("Alcedinidae are a family of small to medium-sized, brightly");
        System.out.println("colored birds in the order Coraciiformes. They have a cosmopolitan");
        System.out.println("distribution, with most species found in the tropical regions");
        System.out.println("of Africa, Asia, and Oceania. The family contains 114 species");
        System.out.println("and is divided into three subfamilies and 19 genera. All");
        System.out.println("kingfishers have large heads, long, sharp, pointed bills,");
        System.out.println("short legs, and stubby tails. ");
    }
}
