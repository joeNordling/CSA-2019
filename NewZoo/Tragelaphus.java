public abstract class Tragelaphus extends Bovidae
{
    public Tragelaphus(String name, String desc)
    {
        super(name, desc);
    }
    
    public String getParent(){
        return "Bovidae";
    }
    
    public void getDescriptionTragelaphus(){
        System.out.println("Tragelaphus is a genus of medium- to large-sized spiral-horned");
        System.out.println("antelopes. It contains several species of bovine, all of which");
        System.out.println("are relatively antelope-like. Species in this genus tend to be");
        System.out.println("large sized, lightly built, have long necks and considerable");
        System.out.println("sexual dimorphism. The common eland (Taurotragus oryx) was once");
        System.out.println("classified in this genus as Tragelaphus oryx. The name 'Tragelaphus'");
        System.out.println("comes from the mythical tragelaph. A common synonym is genus");
        System.out.println("Strepsiceros, which refers to the same set of African antelopes.");
    }
}