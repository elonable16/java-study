package hello2;

import java.io.*;

public class FileReadHangulSuccess {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("D:\\elon\\JAVA__eclipse\\hangul.txt");
			in = new InputStreamReader(fin, "utf-8"); // 한글 확장 완성형 문자 집합 지정
			int c;
			
			System.out.println("인코딩 문자 집합은 " +in.getEncoding());
			while((c = in.read())!=-1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
