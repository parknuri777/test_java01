package helloworld_20240429;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		int b = 200;
		
		System.out.println(a+b);
		System.out.println(a/b); // 0이 출력 -> 정수 대 정수 연산은 무조건 정수로 답이 나옴
		
		double c = 3.5;
		double d = 7.0;
		
		System.out.println(c+d);  // 실수 대 실수 연산은 답이 실수로 나옴
		System.out.println(d/c);  // 실수 대 실수 연산은 소수점이 없는 값도 .0이 붙어서 답이 실수로 나옴
		
		int e = 10;
		double f = 2.5;
		
		System.out.println(e+f);  // 정수 대 실수 연산은 답이 실수로 나옴
		System.out.println(e/f);  // 정수 대 실수 연산은 소수점이 없는 값도 .0이 붙어서 답이 실수로 나옴
				
		int r1, r2;
		
		r1 = e / (int)f;
		r2 = (int)(e/f);
		
		System.out.println(r1);
		System.out.println(r2);
		
		String str1 = "3" + 10;  // 문자열 +정수를 연산하면 양쪽다 문자열로 변환한 후 결합시킴 
		System.out.println(str1);
		
		String numStr1 = "10";
		// int numInt1 = (int)numStr1; // 파이썬에서는 가능하나 자바에서는 불가
				
		//Integer, Double, Boolean 등 -> wrapper class
		int numInt1 = Integer.parseInt(numStr1); // 문자열-> 정수로 변환하는 방법
		
		String numStr2 = "3.14";
		double numDouble1 = Double.parseDouble(numStr2); // 문자열 -> 실수로 변환
		
		String numStr3 = "true";
		boolean numLogic = Boolean.parseBoolean(numStr3);  // 문자열 -> 논리값으로 변환
		
				
		int num1 = 100;
		// String str2 = str(100); //자바에서는 숫자(정수, 실수)를 바로 문자열로 변환 불가
		
		String str2 = String.valueOf(num1);  // 정수 100이 문자열 100으로 변환되어 저장됨
				
		
		
	}

}







