package chap04;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {84,90,96};
		
		int sum = 0;
		for(int i = 0 ; i<scores.length; i++) {
			sum+= scores[i];
		
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("평균 : " + avg);
	}

}
