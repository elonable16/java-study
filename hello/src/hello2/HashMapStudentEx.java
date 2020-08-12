package hello2;

import java.util.*;

class Student {
	private int id;
	private String tel;
	public Student(int id, String tel) {
		this.id = id; this.tel = tel;
	}
	public int getId() {return id;}
	public String getTel() {return tel;}
}
public class HashMapStudentEx {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("Ȳ����", new Student(1, "010-111-11111"));
		map.put("���繮", new Student(1, "010-222-22222"));
		map.put("�賲��", new Student(1, "010-444-33333"));
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("�˻��� �̸���?>>");
			String name = scan.nextLine();
			if(name.equals("exit")) {
				break;
			}
			Student student = map.get(name);
			if(student ==null)
				System.out.println(name + "�� ���� ����Դϴ�.");
			else
				System.out.println("id :" + student.getId() + ", ��ȭ:" + student.getTel());
		}
		scan.close();
		}
	}
