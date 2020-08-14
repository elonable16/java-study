package hello2;

class Person{
	String name;
	String id;
	
	public Person(String name) {
		this.name= name;
	}
}
class Stud extends Person{
	String grade;
	String department;
	public Stud(String name) {
		super(name);
	}
}
public class UpCastingEx {

	public static void main(String[] args) {
		Person p;
		Stud s = new Stud("¿Ã¿ÁπÆ");
		p =s;
		Stud c;
		System.out.println(p.name);
		c= (Stud)p;
		
		System.out.println(c.name);
		c.grade ="c";
		
		
		
	}

}
