package hello2;
import java.io.*;
public class FileInputStreamEx {
	public static void main(String[] args) {
		byte b[] = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("c:\\temp\\test.out");
			int n=0,c;
			while((c=fin.read())!=-1) {
				b[n] = (byte)c;
				n++;
			}
			System.out.println("c:\\temp\\test.out���� ���� �迭�� ����մϴ�.");
			for(int i=0; i<b.length; i++)
				 System.out.print(b[i] + " ");
			System.out.println();
			fin.close();
		} catch (IOException e) {
			System.out.println("c:\\temp\\test.out ���� ���� ���߽��ϴ�.");
		}
	}
}
