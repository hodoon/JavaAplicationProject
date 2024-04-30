package proj0326;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter fout = null;
        int c;
        try {
            fout = new FileWriter("C:\\학교\\2024년 2학년 1학기 수업" +
                    "\\자바응용프로젝트\\javaWorkSpace" +
                    "\\proj0326\\surroundsound2.txt");
            while(true){
                String line = scanner.nextLine();
                if(line.length() == 0){
                    break;
                }
                fout.write(line,0,line.length());
                fout.write("\r\n",0,2);
            }
            fout.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
        scanner.close();
    }
}
