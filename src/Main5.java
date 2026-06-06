import java.util.Scanner;
class Vehicle{
    public void start(){
        System.out.println("Starting the vehicle");
    }
    public void stop(){
        System.out.println("Stopping the vehicle");
    }
    public void fuelType(String fuel){
        System.out.println("This vehicle takes the fuel type "+fuel);
    }
}
class ElectricCar extends Vehicle{
    @Override
    public void start(){
        System.out.println("Starting my electric car");
    }
    public void stop(){
        System.out.println("Stopping my Electric car");
    }
    public void fuelType(String fuel){
        System.out.println("This vehicle uses "+fuel);
    }
}
class PetrolCar extends Vehicle{
    @Override
    public void start(){
        System.out.println("Starting my Petrol car");
    }
    public void stop(){
        System.out.println("Stopping my Petrol car");
    }
    public void fuelType(String fuel){
        System.out.println("This vehicle uses "+fuel);
    }
}
class Bicycle extends Vehicle{
    @Override
    public void start(){
        System.out.println("Starting my Bicycle");
    }
    public void stop(){
        System.out.println("Stopping my Bicycle");
    }
    public void fuelType(String fuel){
        System.out.println("This vehicle uses "+fuel);
    }
}
public class Main5{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {

        Vehicle[]arr={new ElectricCar(),new PetrolCar(),new Bicycle()};
        for(Vehicle a:arr){
            a.start();
            a.stop();
            System.out.println("Enter the type of fuel");
            String f=s.next();
            a.fuelType(f);
        }
    }
}