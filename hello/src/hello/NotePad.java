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
		System.out.println("계산기를 초기화 합니다");
	}
	@Override
	public void Play() {
		System.out.println("더할 숫자 두개를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("결과는 : " + (a+b));
	}
	@Override
	public void Stop() {
		System.out.println("계산을 종료 합니다");
	}
	
}

public class NotePad {
	public static void main(String[] args) {
		
		
		
	}

}
