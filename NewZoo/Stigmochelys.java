public abstract class Stigmochelys extends Testudinidae
{
    public Stigmochelys(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Testudinidae";
    }
    
    public void getDescriptionStigmochelys(){
        System.out.println("his tortoise is a grazing species that favors semi-arid,");
        System.out.println("thorny to grassland habitats. In both very hot and very");
        System.out.println("cold weather they may dwell in abandoned fox, jackal, or");
        System.out.println("aardvark holes. Leopard tortoises do not dig other than to");
        System.out.println("make nests in which to lay eggs."); 
    }
}
