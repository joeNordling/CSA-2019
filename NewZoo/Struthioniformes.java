public abstract class Struthioniformes extends Aves
{
    public Struthioniformes(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Aves";
    }
    
    public void getDescriptionStruthioniformes(){
        System.out.println("Ostriches first appeared during the Miocene epoch, though");
        System.out.println("various Paleocene, Eocene, and Oligocene fossils may also");
        System.out.println("belong to the family. Ostriches are classified in the ratite");
        System.out.println("group of birds, all extant species of which are flightless,");
        System.out.println("including the kiwis, emus, and rheas.");
    }
}