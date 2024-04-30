package exam;

import java.util.ArrayList;

public class PhoneEx {
    public static void main(String[] args) {
        Phone p1 = new Phone("갤럭시S23", "삼성전자", 1000000);
        Phone p2 = new Phone("갤럭시S2O", "삼성전자", 200000);
        Phone p3 = new Phone("아이폰14", "애플", 1500000);
        Phone p4 = new Phone("갤럭시A33", "삼성전자", 300000);
        Phone p5 = new Phone("아이폰13", "애플", 900000);

        ArrayList<Phone> phList = new ArrayList<Phone>();
        phList.add(p1);
        phList.add(p2);
        phList.add(p3);
        phList.add(p4);
        phList.add(p5);

        for (Phone phItem : phList){
            if (phItem.getCompany() == "삼성전자"){
                System.out.println("삼성전자");
                if(phItem.getPrice() < 1000000){
                    System.out.println(phItem.toString());
                }
            } else if (phItem.getCompany() == "애플") {
                System.out.println("애플");
                if(phItem.getPrice() < 1000000){
                    System.out.println(phItem.toString());
                }
            }
        }

    }
}
