package proj0326;

import java.io.*;

public class BinaryCopyEx {
    public static void main(String[] args){
        File src = new File("C:\\학교\\2024년 2학년 1학기 수업" +
                "\\자바응용프로젝트\\javaWorkSpace" +
                "\\proj0326\\cryingcat.jpg");
        BufferedInputStream bin = null;
        File dest = new File("C:\\학교\\2024년 2학년 1학기 수업" +
                "\\자바응용프로젝트\\javaWorkSpace" +
                "\\proj0326\\copyimg2.jpg");
        int readresult;
        try{
            FileInputStream fin = new FileInputStream(src);
            bin = new BufferedInputStream(fin);
            FileOutputStream fo = new FileOutputStream(dest);
            while ((readresult =fin.read())!= -1){
                fo.write((byte)readresult);
            }
            fo.close();
            fin.close();
            System.out.println(src.getPath()+ "를 " +
                    dest.getPath()+ "로 복사하였습니다.");

        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("기타 오류");
            e.printStackTrace();
        }
    }
}
