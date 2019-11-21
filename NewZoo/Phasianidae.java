public abstract class Phasianidae extends Galliformes
{
    public Phasianidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Galliformes";
    }
    
    public void getDescriptionPhasianidae(){
        System.out.println("The Phasianidae are a family of heavy, ground-living birds,");
        System.out.println("which includes pheasants, partridges, junglefowl, chickens,");
        System.out.println("turkeys, Old World quail, and peafowl. The family includes");
        System.out.println("many of the most popular gamebirds. The family is a large one,");
        System.out.println("and is occasionally broken up into two subfamilies, the");
        System.out.println("Phasianinae and the Perdicinae.");
    }
}