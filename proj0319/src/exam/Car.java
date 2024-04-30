package exam;

public class Car {
    private String color;
    protected int speed;
    //static 정적
    static int carCount = 0;
    final static int MAXSPEED = 200;
    final static int MINSPEED = 0;

    static int currentCarCount(){
        return carCount;
    }

    public Car(){}
    public Car(String color, int speed) {
        super();
        this.color = color;
        this.speed = speed;
        carCount++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car {" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
