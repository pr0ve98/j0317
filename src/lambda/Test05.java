package lambda;

// 람다식을 구현하기 위해서는 '함수형(적) 인터페이스'를 생성해 준다.
// 함수형 인터페이스: 추상메소드가 단 1개인 인터페이스이다.

@FunctionalInterface
interface MyFunc5 {
	int add(int x, int y);
}

public class Test05 {
	public static void main(String[] args) {
//		MyFunc5 MyFunc5 = new MyFunc5() {
//			@Override
//			public int add(int x, int y) {
//				return x+y;
//			}
//		};
		
		MyFunc5 myFunc5 = (x, y) -> x+y;
		
		int res = myFunc5.add(40, 50);
		System.out.println("res: "+res);
	}
}
