package hello2;

public class MathEx {
	public static void main(String[] args) {
		System.out.println(Math.PI); // 원주율 상수
		System.out.println(Math.ceil(3.14)); // 올림
		System.out.println(Math.floor(3.14)); // 내림
		System.out.println(Math.sqrt(9)); //제곱근(루트)
		System.out.println(Math.exp(2)); // e의 2승
		System.out.println(Math.round(3.14));// 반올림
		
		System.out.print("이번주의 행운의 번호는 ");
		for(int i=0; i<5; i++) {
			System.out.print((int)(Math.random()*45+1) + " "); // 난수
		}
	}
}
