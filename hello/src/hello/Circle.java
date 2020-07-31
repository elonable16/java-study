package hello;

public class Circle {
	int radius;
	String name;
	
	public Circle() {//매개변수 없는 생성자
		radius = 2; name = "";
	}
	public Circle(int r,String n) {
		radius = r; name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Circle pizza = new Circle(10, "자바피자"); //객체 생성, 매개변수 지정
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.name ="자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);		
	}
}