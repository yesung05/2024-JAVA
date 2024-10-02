package first;

public class VarScope {
	public static void main(String[] args) {
		int v1= 15;
		if(v1<10) {
			int v2 = v1-10; // 
			System.out.println(v2);
		}
		//v3 = v1 + v2 +5
		
//	System.out.println(v2); v2변수 범위 밖
	}
}

// camelCase
// snake_case
// SomthingCase
