package review;

public class UseAry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandNum rn = new RandNum();
		rn.makeAry();
		rn.printAry();
		System.out.printf("maxval : %d\n", rn.getMaxVal());
		System.out.printf("minval : %d\n", rn.getMinVal());
		
		rn.makeAry();
		rn.printAry();
		System.out.printf("maxval : %d\n", rn.getMaxVal());
		System.out.printf("minval : %d\n", rn.getMinVal());
	}

}
