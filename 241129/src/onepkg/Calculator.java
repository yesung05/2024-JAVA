package onepkg;

public class Calculator {
	public int add(int [] NumAry) {
		return NumAry[0] + NumAry[1];
	}
	public int minus(int [] NumAry) {
		return NumAry[0] - NumAry[1];
	}
	public long multi(int [] NumAry) {
		return (long)NumAry[0] * NumAry[1];
	}
	public double devision(int [] NumAry) {
		return (double)NumAry[0] / NumAry[1];
	}
}
