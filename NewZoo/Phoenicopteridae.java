public abstract class Phoenicopteridae extends Phoenicopteriformes
{
    public Phoenicopteridae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Phoenicopteriformes";
    }
    
    public void getDescriptionPhoenicopteridae(){
        System.out.println("Phoenicopteridae is a wading bird family including flamingos and their");
        System.out.println("close extinct relatives. Flamingos and their relatives are well attested");
        System.out.println("in the fossil record, with the first unequivocal member of the");
        System.out.println("Phoenicopteridae, Elornis known from the late Eocene epoch. A");
        System.out.println("considerable number of little-known birds from the Late Cretaceous onwards");
        System.out.println("are sometimes considered to be flamingo ancestors.");
    }
}