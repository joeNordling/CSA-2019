public class Main
{
    public static void Main(){
        Vehicle vehicle = new Vehicle("Mazda", "Mazda3 Touring", 2017);
        vehicle.turnLeft();
        Car car = new Car("Ford", "Thunderbird", 2002);
        car.Honk();
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "H-D", 1916);
        motorcycle.Honk();
    }
}
