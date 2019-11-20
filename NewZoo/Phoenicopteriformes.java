public abstract class Phoenicopteriformes extends Aves
{
    public Phoenicopteriformes(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Aves";
    }
    
    public void getDescriptionPhoenicopteriformes(){
        System.out.println("Phoenicopteriformes is a group of water birds which comprises");
        System.out.println("flamingos and their extinct relatives. Flamingos and their");
        System.out.println("relatives are well attested in the fossil record, with the first");
        System.out.println("unequivocal member of the Phoenicopteridae, Elornis known from the");
        System.out.println("late Eocene epoch. An extinct family of peculiar 'swimming flamingos',");
        System.out.println("the Palaelodidae, are believed to be the closest relatives of the");
        System.out.println("modern flamingos, with the extinct genus Juncitarsus slightly more");
        System.out.println("primitive than the group which contains flamingos and grebes (Mirandornithes).");
    }
}