public class Car {
    private String color;
    private int speed = 0;

    public Car(){}
    public Car(String color, int speed) {
        super();
        this.color = color;
        this.speed = speed;
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

    void upSpeed(int value){
        if (speed + value >= 200) {
            speed = 200;
        } else {
            speed = speed + value;
        }
    }

    void downSpeed(int value){
        if (speed - value <= 0){
            speed = 0;
        } else {
            speed = speed - value;
        }
    }

}
