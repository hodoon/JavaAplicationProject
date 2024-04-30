public class StudentEx {
    public static void main(String[] args){
        Student st1 = new Student("윤도훈", 20202858, "컴퓨터소프트웨어공학과", "010-1234-1234");
        Student st2 = new Student("홍길동", 20241111, "인공지능학과", "010-1111-2222");
        System.out.println("이름 : " + st1.getName()
                + " 학번 : " + st1.getStuId()
                + " 전공 : " + st1.getDept()
                + " 연락처 : " + st1.getTel());
        System.out.println("이름 : " + st2.getName()
                + " 학번 : " + st2.getStuId()
                + " 전공 : " + st2.getDept()
                + " 연락처 : " + st2.getTel());
        st1.toString();
        st2.toString();
    }
}
