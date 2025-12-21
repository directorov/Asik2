    //1
public class Car {
    //2
    private int wheels;
    private String color;
    private String engine;

    //3
    //no
    public Car() {
    }
    //yes
    public Car(int wheels, String color, String engine) {
        this.wheels = wheels;
        this.color = color;
        this.engine = engine;
    }

    //4
    // getters
    public int getWheels() { return wheels; }
    public String getColor() { return color; }
    public String getEngine() { return engine; }
    //setters
    public void setWheels(int wheels) { this.wheels = wheels; }
    public void setColor(String color) { this.color = color; }
    public void setEngine(String engine) { this.engine = engine; }
}
