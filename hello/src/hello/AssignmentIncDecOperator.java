package hello;
public class AssignmentIncDecOperator {
	public static void main(String[] args) {
		int a=3, b=3, c=3;
		byte e = 19, f = -8;
		a += 3; // a=a+3 = 6
		b *= 3; // b=b*3 = 9
		c %= 2; // c=c%2 = 1
		System.out.println("a=" +a + ", b=" + b + ",c=" + c);
		
		int d=3;
		//증감 연산자 사례 
		a = d++; // a=3,d=4
		System.out.println("a=" + a + ", d=" + d);
		a = ++d; // d=5,a=5
		System.out.println("a=" + a + ", d=" + d);
		a = d--; // a=5,d=4
		System.out.println("a=" + a + ", d=" + d);
		a = --d;// d=3, a=3
		System.out.println("a=" + a + ", d=" + d);
		
		System.out.println('a'>'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3==2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		// 비교연산과 논리 연산 복합
		System.out.println((3 > 2) && (3 > 4));
		System.out.println((3 > 2) || (-1 > 0));
		System.out.println((3 !=2) ^ (-1 > 0));
		
		System.out.println(e>>1);
		System.out.println(e>>2);
		System.out.printf("%d\n",f);
		System.out.printf("%x\n",f>>>1);
		System.out.printf("%x\n",f>>>2);

	}

}
