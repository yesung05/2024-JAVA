package chap04;

public class StringTEst {

	public static void main(String[] args) {
		String sTot = "10Point,23Point,33Point,45Point,55Point,67Point";
		String[] sValues = sTot.split(",");
		
		int[] iValues = new int[sValues.length]; // 이부분만 gpt
		int sum =0;
		
		for(int i = 0; i < sValues.length; i++) {
			sValues[i] = sValues[i].substring(0,2); //.replace("Point","")
			iValues[i] = Integer.parseInt(sValues[i]);
			sum +=iValues[i];
		}
		
		System.out.printf("1. TotCnt : %d\n",sValues.length);
		System.out.printf("2. SumValue : %d\n",sum);
		System.out.printf("3. Average : %f\n", ((float)sum/iValues.length));
		System.out.printf("4. Average : %10.2f\n",((float)sum/iValues.length));
		
	}

}
