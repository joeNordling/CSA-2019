public abstract class Diceros extends Rhinocerotidae
{
    public Diceros(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Rhinocerotidae";
    }
    
    public void getDescriptionDiceros(){
        System.out.println("The species overall is classified as critically endangered");
        System.out.println("(even though the South-western black rhinoceros is classified as vulnerable).");
        System.out.println("Three subspecies have been declared extinct, including the western black");
        System.out.println("rhinoceros, which was declared extinct by the International Union for");
        System.out.println("Conservation of Nature (IUCN) in 2011.");
    }
}