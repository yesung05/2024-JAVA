package chap04;

public class StringTest2 {

	public static void main(String[] args) {
		String sStudent1 = "math:85, calc:93, science:71";
		String sStudent2 = "calc:71, math:88, science:92";
		String[] sStudent1sp = sStudent1.split(", ");
		String[] sStudent2sp = sStudent2.split(", ");
		int MathSum = 0, CalcSum = 0, SciSum = 0;
		
		for(int i = 0 ; i < sStudent1sp.length; i++) {
			String[] parts = sStudent1sp[i].split(":");
			String subject = parts[0];
			int score = Integer.parseInt(parts[1]);
            switch (subject) {
                case "math":
                    MathSum += score;
                    break;
                case "calc":
                    CalcSum += score;
                    break;
                case "science":
                    SciSum += score;
                    break;
	            }
		}
		
		for(int i = 0 ; i < sStudent2sp.length; i++) {
			String[] parts = sStudent2sp[i].split(":");
			String subject = parts[0];
			int score = Integer.parseInt(parts[1]);
            switch (subject) {
                case "math":
                    MathSum += score;
                    break;
                case "calc":
                    CalcSum += score;
                    break;
                case "science":
                    SciSum += score;
                    break;
	            }
		}
		float MathAvg = (float)(MathSum)/2;
		float CalcAvg = (float)(CalcSum)/2;
		float SciAvg = (float)(SciSum)/2;
		
//		System.out.printf("%d %d %d",MathSum,CalcSum,SciSum);
		System.out.printf("Math 총합 %d Math 평균 %.2f\n",MathSum, MathAvg);
		System.out.printf("Clac 총합 %d Calc 평균 %.2f\n",CalcSum, CalcAvg);
		System.out.printf("Science 총합 %d Science 평균 %.2f\n",SciSum, SciAvg);
	}

}
