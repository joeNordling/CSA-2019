public class Motorcycle extends Vehicle{
    
    public Motorcycle(String Make, String Model, int Year){
        super(Make, Model, Year);
    }
    
    public void Honk(){
        System.out.println("You hear the motor begin to roar from the Motorcycle");
    }
}