public class Vehicle
{
    String make;
    String model;
    int year;
    
    public Vehicle(String Make, String Model, int Year){
        this.make = Make;
        this.model = Model;
        this.year = Year;
    }
    
    public void forward(int amount){
        System.out.println("Moving forward " + amount + " feet");
    }
    
    public void backward(int amount){
        System.out.println("Moving backward " + amount + " feet");
    }
    
    public void turnLeft(){
        System.out.println("Turning Left");
    }
    
    public void turnRight(){
        System.out.println("Turning Right");
    }
}