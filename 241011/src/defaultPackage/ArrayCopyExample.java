package defaultPackage;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50,60,70,80,90,100};
		int b[] = {0,1,2,3,4,5,6,7,8,9};
		
		int sourcePos = 3;
		int destPos = 5;
		int len = 4;
		
		System.arraycopy(a, sourcePos, b, destPos, len);
		
		System.out.print("a Array: ");
		for(int i = 0; i< a.length; i++) System.out.print(a[i] + " ");
		
		System.out.print("\nb Array: ");
		for(int i = 0; i< b.length; i++) System.out.print(b[i] + " ");
		
		System.out.print("\n--------------------------------\n");
		b[0]=10;
		System.out.print("a Array: ");
		for(int i = 0; i< a.length; i++) System.out.print(a[i] + " ");
		
		System.out.print("\nb Array: ");
		for(int i = 0; i< b.length; i++) System.out.print(b[i] + " ");
	}

}
