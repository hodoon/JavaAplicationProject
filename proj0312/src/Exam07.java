public class Exam07 {
    public static void main(String[] args){
        //1. Car클래스 만들기
        //2. 객체 만들기
        Car myCar1 = new Car("빨강", 0);
        Car myCar2 = new Car("파랑", 0);
        Car myCar3 = new Car("초록", 0);
        //3. 객체.메소드() 호출
        myCar1.upSpeed(50);
        System.out.println("자동차1의 색상은 " + myCar1.getColor() 
                + "이며, 속도는" 
                + myCar1.getSpeed() + "km입니다.");
        myCar2.upSpeed(20);
        System.out.println("자동차2의 색상은 " + myCar2.getColor()
                + "이며, 속도는"
                + myCar2.getSpeed() + "km입니다.");
        myCar3.upSpeed(250);
        System.out.println("자동차3의 색상은 " + myCar3.getColor()
                + "이며, 속도는"
                + myCar3.getSpeed() + "km입니다.");
     
    }
}
