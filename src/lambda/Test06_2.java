package lambda;

// 람다식을 이용해 제곱값을 구하시오.

@FunctionalInterface
interface MyFunc6_2 {
	int calc(int x);
}

// 원넓이를 람다식으로 구하시오.
@FunctionalInterface
interface MyFunc6_2_2 {
	int calc(int r);
}
@FunctionalInterface
interface MyFunc6_2_3 {
	double calc(int r);
}

public class Test06_2 {
	public static void main(String[] args) {
//		MyFunc6_2 myFunc6 = new MyFunc6_2() {
//			
//			@Override
//			public int calc(int x) {
//				return x * x;
//			}
//		};
		
		MyFunc6_2 myFunc6_2 = (x) -> x * x;
		MyFunc6_2_2 myFunc6_2_2 = (r) -> (int)(r * r * Math.PI);
		MyFunc6_2_3 myFunc6_2_3 = (r) -> r * r * Math.PI;
		
		System.out.println("5의 거듭제곱: "+myFunc6_2.calc(5));
		System.out.println("반지름 10인 원넓이: "+myFunc6_2_2.calc(10));
		System.out.println("반지름 10인 원넓이: "+myFunc6_2_3.calc(10));
	}
}
