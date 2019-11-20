public abstract class Callitrichidae extends Primates
{
    public Callitrichidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Primates";
    }
    
    public void getDescriptionCallitrichidae(){
        System.out.println("The Callitrichidae are a family of New World monkeys, including");
        System.out.println("marmosets, tamarins and lion tamarins. At times, this group of animals");
        System.out.println("has been regarded as a subfamily, called Callitrichinae, of the family Cebidae.");
        System.out.println("This taxon was traditionally thought to be a primitive lineage, from which");
        System.out.println("all the larger-bodied platyrrhines evolved. However, some works argue that");
        System.out.println("callitrichids are actually a dwarfed lineage.");
    }
}