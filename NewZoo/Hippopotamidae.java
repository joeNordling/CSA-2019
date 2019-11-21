public abstract class Hippopotamidae extends Artiodactyla
{
    public Hippopotamidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Artiodactyla";
    }
    
    public void getDescriptionHippopotamidae(){
        System.out.println("Hippopotamuses are stout, naked-skinned, and amphibious artiodactyl");
        System.out.println("mammals, possessing three-chambered stomachs and walking on four");
        System.out.println("toes on each foot. While they resemble pigs physiologically,");
        System.out.println("their closest living relatives are the cetaceans. Hippopotamuses");
        System.out.println("are the only living members of the family Hippopotamidae.");
    }
}