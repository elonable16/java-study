package hello;

public class Circle {
	int radius;
	String name;
	
	public Circle() {//�Ű����� ���� ������
		radius = 2; name = "";
	}
	public Circle(int r,String n) {
		radius = r; name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Circle pizza = new Circle(10, "�ڹ�����"); //��ü ����, �Ű����� ����
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle donut = new Circle();
		donut.name ="�ڹٵ���";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);		
	}
}