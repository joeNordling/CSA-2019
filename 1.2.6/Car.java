public class Car extends Vehicle
{
    public Car(String Make, String Model, int Year){
        super(Make, Model, Year);
    }

    public void Honk(){
        System.out.println("You hear the loud beeping of the Car's horn");
    }
}