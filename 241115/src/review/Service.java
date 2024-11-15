package review;

public interface Service {
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
		defaultCommon();
	}
	
	private void defaultCommon() {
		System.out.println("defaultMethod 중복 코드 A");
		System.out.println("defaultMethod 중복 코드 B");
	}
	
	static void staticMethod1() {
		System.out.println("staticMethod1 종속코드");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2 종속코드");
		staticCommon();
	}
	
	private static void staticCommon() {
		System.out.println("staticCommon 중복 코드C");
		System.out.println("staticCommon 중복 코드D");
	}
}
