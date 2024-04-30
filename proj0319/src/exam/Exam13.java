package exam;

import java.util.ArrayList;

public class Exam13 {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("컴소과");
        arrayList.add("컴정과");
        arrayList.add("인공지능학과");

        for (int i =0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        for(String item : arrayList){
            System.out.println(item);
        }

        ArrayList<Car> carList = new ArrayList<Car>();
        Car car1 = new Car("빨강", 100);
        Car car2 = new Car("검정", 50);
        Car car3 = new Car("노랑", 170);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(new Car("초록", 20));

        for (Car item : carList){
            if(item.speed >= 50){
                System.out.println(item);
            }
        }

    }
}
