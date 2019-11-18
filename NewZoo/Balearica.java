public abstract class Balearica extends Gruidae
{
    public Balearica(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Gruidae";
    }
    
    public void getDescriptionBalearica(){
        System.out.println("The bird genus Balearica contains two extant");
        System.out.println("species in the crane family Gruidae: the black");
        System.out.println("crowned crane and the grey crowned crane");
        System.out.println("The species today occur only in Africa,");
        System.out.println("south of the Sahara Desert, and are the");
        System.out.println("only cranes that can nest in trees. This");
        System.out.println("habitat is one reason the relatively small");
        System.out.println("Balearica cranes are believed to closely");
        System.out.println("resemble the ancestral members of the Gruidae.");
    }
}
