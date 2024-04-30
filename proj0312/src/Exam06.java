public class Exam06 {
    public static void main(String[] args){
     int num1 = 100, num2 = 0;
     try {
         //정상 처리
         System.out.println(num1/num2);
     }catch (Exception e){
         //에러(Exception) 발생시 처리
         System.out.println(e);
         e.printStackTrace();
         System.out.println("계산에 문제가 있습니다.");
     }
    }
}
