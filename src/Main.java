import java.util.Scanner;
//cars
public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(4, "Red", "Petrol");
        Car car2 = new Car(6,"Blue", "Diesel");
        System.out.println("Car 1:");
        System.out.println("Wheels: " + car1.getWheels());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Engine: " + car1.getEngine());
        System.out.println("Car 2:");
        System.out.println("Wheels: " + car2.getWheels());
        System.out.println("Color: " + car2.getColor());
        System.out.println("Engine: " + car2.getEngine());

        Scanner scanner = new Scanner(System.in);

        Car car3 = new Car();
        System.out.println("Car 3:");
        System.out.println("Write color car's");
        car3.setColor(scanner.nextLine());
        System.out.println("Car has: " + car3.getColor() + " color");
        System.out.println("Write how many wheels car has");
        car3.setWheels(Integer.parseInt(scanner.nextLine()));
        System.out.println("Car has: " + car3.getWheels() + " wheels");
        System.out.println("Write engine car");
        car3.setEngine(scanner.nextLine());
        System.out.println("Car has: " + car3.getEngine() + " engine");


        Human human1 = new Human(18,"Omirzak");
        Human human2 = new Human();
        System.out.println("Welcome Human, answer me are you student? ");
        human2.setH_name(scanner.nextLine());
        System.out.println("Hi, you are student" + human2.getH_Name() );


    }
}
