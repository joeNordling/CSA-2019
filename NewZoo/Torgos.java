public abstract class Torgos extends Accipitridae
{
    public Torgos(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Accipitridae";
    }
    
    public void getDescriptionTorgos(){
        System.out.println("The lappet-faced vulture was formerly considered monotypical,");
        System.out.println("but now is separated into two subspecies. The nominate race");
        System.out.println("lives throughout Africa. The subspecies T. t. negevensis,");
        System.out.println("differing considerably in appearance from African vultures,");
        System.out.println("occurs in , the Negev desert, and the Sinai and Arabian peninsulas.");
    }
}
