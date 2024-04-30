package exam;

import java.util.ArrayList;

public class StudentEx {
    public static void main(String[] args){
        Student st1 = new Student("윤도훈", 20201111, "컴소과", "010-1111-1111");
        Student st2 = new Student("홍길동", 20202222, "컴소과", "010-2222-2222");
        Student st3 = new Student("김남호", 20203333, "컴정과", "010-3333-3333");
        Student st4 = new Student("박중민", 20201234, "컴정과", "010-1234-1234");

        ArrayList<Student> stdList = new ArrayList<>();
        stdList.add(st1);
        stdList.add(st2);
        stdList.add(st3);
        stdList.add(st4);

        for(Student stdItem : stdList){
            if (stdItem.getDept() == "컴소과"){
                System.out.println("컴퓨터소프트웨어공학과");
                System.out.println(stdItem.toString());
            }
        }
        for(Student stdItem : stdList){
            if (stdItem.getDept() == "컴정과"){
                System.out.println("컴퓨터정보공학과");
                System.out.println(stdItem.toString());
            }
        }
    }
}
