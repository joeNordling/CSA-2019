public abstract class Rhinocerotidae extends Perissodactyla
{
    public Rhinocerotidae(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Perissodactyla";
    }
    
    public void getDescriptionRhinocerotidae(){
        System.out.println("Members of the rhinoceros family are some of the largest");
        System.out.println("remaining megafauna, with all species able to reach or exceed");
        System.out.println("one tonne in weight. They have a herbivorous diet, small brains (400–600 g)");
        System.out.println("for mammals of their size, one or two horns, and a thick (1.5–5 cm)");
        System.out.println("protective skin formed from layers of collagen positioned in a lattice structure.");
    }
}