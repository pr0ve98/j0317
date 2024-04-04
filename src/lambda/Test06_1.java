package lambda;

// 람다식을 이용해 제곱값을 구하시오.

@FunctionalInterface
interface MyFunc6 {
	int calc(int x);
}

public class Test06_1 {
	public static void main(String[] args) {
		MyFunc6 myFunc6 = new MyFunc6() {
			
			@Override
			public int calc(int x) {
				return x * x;
			}
		};
		
		System.out.println("5의 거듭제곱: "+myFunc6.calc(5));
	}
}
