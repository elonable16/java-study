package hello;
import java.util.Scanner;
interface notepadPlugin {
	void init();

	void Play();

	void Stop();
}
class notepadview implements notepadPlugin {
	@Override
	public void init() {
		System.out.println("���⸦ �ʱ�ȭ �մϴ�");
	}
	@Override
	public void Play() {
		System.out.println("���� ���� �ΰ��� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("����� : " + (a+b));
	}
	@Override
	public void Stop() {
		System.out.println("����� ���� �մϴ�");
	}
	
}

public class NotePad {
	public static void main(String[] args) {
		
		
		
	}

}