public abstract class Aves extends Chordata implements Flying
{
    public Aves(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Chordata";
    }
    
    public void getDescriptionAves(){
        System.out.println("Aves or avian dinosaurs, are a group of");
        System.out.println("endothermic vertebrates, characterised by");
        System.out.println("feathers, toothless beaked jaws, the laying");
        System.out.println("of hard-shelled eggs, a high metabolic rate,");
        System.out.println("a four-chambered heart, and a strong yet");
        System.out.println("lightweight skeleton.");
    }
}

