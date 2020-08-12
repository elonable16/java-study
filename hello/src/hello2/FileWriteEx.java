package hello2;
import java.io.*;
import java.util.*;

public class FileWriteEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:\\temp\\test.txt");
			while(true) {
				String line = scan.nextLine();
				if(line.length() == 0)
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		}catch (IOException e) {
			System.out.println("����� ����");
		}
		scan.close();
	}
}