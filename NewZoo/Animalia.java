public abstract class Animalia implements parent
{
    private String name;
    private String desc;
    
    public Animalia(String name, String desc)
    {
        this.name = name;
        this.desc = desc;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    public abstract String eat();
    
    public abstract String makeNoise();
    
    public abstract String[] getParents();
    
    public abstract void getDescription(String statement);
    
    public void getDescriptionAnimalia(){
        System.out.println("Members of the Animalia Kingdom are multicellular eukaryotic organisms");
        System.out.println("that form the biological kingdom Animalia. With few exceptions, animals");
        System.out.println("consume organic material, breathe oxygen, are able to move, can reproduce");
        System.out.println("sexually, and grow from a hollow sphere of cells, the blastula, during");
        System.out.println("embryonic development.");
    }
}
