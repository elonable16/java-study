package hello;

import java.util.Scanner;
public class hello {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int num[] = new int[n];
		for(int i=0;i < n; i++) {
			num[i] = scan.nextInt();
		}
		for(int i=0 ; i < n; i++) {
			if(num[i] < x) {
				System.out.print(num[i] + " ");
			}
		}
	}
}
