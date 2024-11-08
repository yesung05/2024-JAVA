package chap04;

public class CharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "010101101010";
		char gender = ssn.charAt(6);
		switch (gender) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
		//asdasdasdasdasdadasda
		String str = "CharAtExample_Text1";
		String s1 = str.substring(12);
		System.out.printf("s1 : %s\n",s1);
		String s2 = str.substring(12,15);
		System.out.printf("s2 : %s\n", s2);
	//
		String str2 = "CharAtExample_Test2";
		int al = str2.indexOf('E');
		System.out.printf("al : %d\n", al);
	}

}
