public abstract class Sciuridae extends Rodentia
{
    public Sciuridae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Rodentia";  
    }
    
    public void getDescriptionSciuridae(){
        System.out.println("A family that includes small or medium-size rodents. The");
        System.out.println("squirrel family includes tree squirrels, ground squirrels,");
        System.out.println("chipmunks, marmots (including woodchucks), flying squirrels,");
        System.out.println("and prairie dogs amongst other rodents. ");
    }
}
