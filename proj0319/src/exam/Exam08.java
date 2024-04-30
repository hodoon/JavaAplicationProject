package exam;

public class Exam08 {
    public static void main(String args[]){
        Car myCar1 = new Car("빨강",0);
        Car myCar2 = new Car("파랑",0);
        Car myCar3 = new Car("초록",0);

        System.out.println("생산된 차의 대수(정적 필드) ==> " + Car.carCount);
        System.out.println("내 차의 색상 및 속도 ==> " + myCar1.getColor()
                + ", " + myCar1.getSpeed());
        System.out.println("2번 차의 색상 및 속도 ==> " + myCar2.getColor()
                + ", " + myCar2.getSpeed());
        System.out.println("3번 차의 색상 및 속도 ==> " + myCar3.getColor()
                + ", " + myCar3.getSpeed());
        System.out.println("생산된 차의 대수(정적 메소드) ==> " + Car.currentCarCount());
        System.out.println("차의 최소 제한속도 ==> " + Car.MAXSPEED);

        System.out.println("PI의 값 ==> " + Math.PI);
        System.out.println("3의 5제곱 ==> " + Math.pow(3,5));
    }
}
