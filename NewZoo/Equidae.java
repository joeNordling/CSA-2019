public abstract class Equidae extends Perissodactyla
{
    public Equidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Perissodactyla";
    }
    
    public void getDescriptionEquidae(){
        System.out.println("Equidae is the taxonomic family of horses and related animals,");
        System.out.println("including the extant horses, donkeys, and zebras, and many other");
        System.out.println("species known only from fossils. All extant species are in the genus");
        System.out.println("Equus. Equidae belongs to the order Perissodactyla, which includes the");
        System.out.println("extant tapirs and rhinoceros, and several extinct families.");
    }
}