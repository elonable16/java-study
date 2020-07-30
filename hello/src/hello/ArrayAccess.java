package hello;
import java.util.Scanner;
public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max=0;
		int min = 999999;
		System.out.println("양수 5개를 입력하세요.");
		for(int i=0; i<5; i++) {
			intArray[i]=scan.nextInt();
			if(intArray[i] > max) {
				max = intArray[i];
			}
			if(intArray[i] < min) {
				min = intArray[i];
			}
		}
		System.out.print("가장 큰 수는" + max +"입니다");
		System.out.print("가장 작은 수는" + min +"입니다");
		scan.close();
	}
}
