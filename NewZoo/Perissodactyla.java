public abstract class Perissodactyla extends Mammalia
{
    public Perissodactyla(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Mammalia";
    }
    
    public void getDescriptionPerissodactyla(){
        System.out.println("Perissodactyla are hoofed animals—ungulates—which bear most");
        System.out.println("of their weight on one (an odd number) of the five toes: the");
        System.out.println("third toe. The non-weight-bearing toes are either present, absent,");
        System.out.println("vestigial, or positioned posteriorly. ");
    }
}