
public class Samhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		char grade = (score>90) ? 'A' : ( (score >80 )? 'B' : 'C');
		System.out.println("score : " + score + ", grade : " + grade);
		
		int num = 10;
		String val = new String((num>0) ? "plus" : ( (score < 0 )? "minus" : "0"));
		System.out.println(val);
	}

}
