package hello;
import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("�̸�, ����, ���� , ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.println("�̸��� " + name + ",");
		
		String city = scanner.next();
		System.out.println("���ô� " + city + ",");

		int age = scanner.nextInt();
		System.out.println("���̴� " + age + ",");
		
		double weight = scanner.nextDouble();
		System.out.println("���ô� " + weight + ",");
		
		boolean isSingle = scanner.nextBoolean();
		System.out.println("���ô� " + isSingle + "�Դϴ�");
		scanner.close();
	}

}
