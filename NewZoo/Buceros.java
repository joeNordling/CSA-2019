public abstract class Buceros extends Bucorvidae
{
    public Buceros(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Bucorvidae";
    }
    
    public void getDescriptionBuceros(){
        System.out.println("Buceros is a genus of large Asian hornbills (family Bucerotidae)."); 
    }
}