package hello;
import java.util.Scanner;
public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max=0;
		int min = 999999;
		System.out.println("��� 5���� �Է��ϼ���.");
		for(int i=0; i<5; i++) {
			intArray[i]=scan.nextInt();
			if(intArray[i] > max) {
				max = intArray[i];
			}
			if(intArray[i] < min) {
				min = intArray[i];
			}
		}
		System.out.print("���� ū ����" + max +"�Դϴ�");
		System.out.print("���� ���� ����" + min +"�Դϴ�");
		scan.close();
	}
}
