package sup2.model;

public class Student {

	String 이름;
	int 학년;
	int 반;
	int 번호;
	char 성별;
	double 성적;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String 이름, int 학년, int 반, int 번호, char 성별, double 성적) {
		super();
		this.이름 = 이름;
		this.학년 = 학년;
		this.반 = 반;
		this.번호 = 번호;
		this.성별 = 성별;
		this.성적 = 성적;
	}
	
	public void 정보() {
		String 성별확인 = (성별=='M')? "남학생":"여학생";
	}
	
}
