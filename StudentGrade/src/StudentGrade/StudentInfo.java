package StudentGrade;

public class StudentInfo {
	private String name;
	private int [] grade = new int[3];
	private int total;
	private int avg_grade;
	
	// 생성자(합계 , 평균 생성) //
	public StudentInfo(String name, int math, int science, int history) {
		this.setname(name);
		this.setgrade(math, science, history);
		this.total = math + science + history;
		this.avg_grade = this.total/grade.length;
		
	}
	// 이름 입력 //
	public void setname(String name) {
		this.name = name;
	}
	// 성적 입력 //
	public void setgrade(int math, int science, int history) {
		this.grade[0] = math;
		this.grade[1] = science;
		this.grade[2] = history;
	}
	// 모든 정보 넘기기 //
	public String getelement(int n) {
		String[] element = {this.name, Integer.toString(this.grade[0]), Integer.toString(this.grade[1]), Integer.toString(this.grade[2]),Integer.toString(total),Integer.toString(avg_grade)};
		return element[n];
	}
}
