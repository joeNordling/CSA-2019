public abstract class Dacelo extends Alcedinidae
{
    public Dacelo(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Alcedinidae";
    }
    
    public void getDescriptionDacelo(){
        System.out.println("They are found in habitats ranging from humid forest");
        System.out.println("to arid savanna, as well as in suburban areas with tall");
        System.out.println("trees or near running water. Even though they belong");
        System.out.println("to the larger group known as 'kingfishers',");
        System.out.println("kookaburras are not closely associated with water.");
    }
}
