package proj0326;

import java.io.*;

public class ReaderEx {
    public static void main(String[] args) {
        FileReader fin = null;
        try {
            fin = new FileReader("C:\\학교\\2024년 2학년 1학기 수업" +
                    "\\자바응용프로젝트\\javaWorkSpace" +
                    "\\proj0326\\surroundsound.txt");
            BufferedReader bin = new BufferedReader(fin);
            int reader;
            while ((reader = fin.read())!= -1){
                System.out.print((char)reader);
            }
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("파일을 출력할 수 없습니다.");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("예상치 못한 오류");
        }
    }
}
