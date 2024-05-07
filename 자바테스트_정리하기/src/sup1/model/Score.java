package sup1.model;

public class Score {
//필드 
	private int 국어;
	private int 영어; 
	private int 수학;
	private int 총점;
	private double 평균;
	
	
	


	public Score() {
	}
	
	
	public Score(int 국어, int 영어, int 수학, int 총점, double 평균) {
		super();
		this.국어 = 국어;
		this.영어 = 영어;
		this.수학 = 수학;
		this.총점 = 총점;
		this.평균 = 평균;
	}
	

	public void 점수() {
		총점 = 국어+영어+수학;
		평균 = 총점 / 3.0;
		String 결과 = (국어>=50 && 수학 >=50 && 영어 >= 50)? "합격" : "불합격";
		
		
		System.out.println(국어);
		System.out.println(영어);
		System.out.println(수학);
		System.out.println(결과);
		
		}
		
		
		
		
	}
	
	
	
	
	

