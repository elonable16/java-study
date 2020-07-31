package hello;
import java.util.Scanner;
public class hello {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt() ;
		int m = scan.nextInt();
		int alarm = h*60 + m - 45;
		if(alarm >= 0) {
			System.out.print(alarm/60 + " " + alarm%60);
		}
		else {
			System.out.print((alarm+1440)/60 + " " + (alarm+1440)%60);
		}
		scan.close();
	}
}
