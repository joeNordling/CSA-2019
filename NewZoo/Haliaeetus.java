public abstract class Haliaeetus extends Accipitridae
{
    public Haliaeetus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Accipitridae";
    }
    
    public void getDescriptionHaliaeetus(){
        System.out.println("The genus Haliaeetus was introduced in 1809");
        System.out.println("by the French naturalist Marie Jules César Savigny");
        System.out.println("in his chapter on birds in the Description de l'Égypte.");
        System.out.println("The two fish eagles in the genus Ichthyophaga found to lie");
        System.out.println("within the genus in a genetic study in 2005, and then placed therein.");
    }
}
