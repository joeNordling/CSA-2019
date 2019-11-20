public abstract class Eclectus extends Psittaculidae
{
    public Eclectus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Psittaculidae";
    }
    
    public void getDescriptionEclectus(){
        System.out.println("The eclectus parrot is a parrot native to the Solomon Islands, ");
        System.out.println("Sumba, New Guinea and nearby islands, northeastern Australia,");
        System.out.println("and the Maluku Islands (Moluccas). It is unusual in the parrot");
        System.out.println("family for its extreme sexual dimorphism of the colours of the plumage;");
        System.out.println("the male having a mostly bright emerald green plumage and the female a");
        System.out.println("mostly bright red and purple/blue plumage.");
    }
}