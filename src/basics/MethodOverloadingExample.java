public class MethodOverloadingExample {

	public static void main(String[] args) {
	byte byteParam = 65;
			System.out.println("Square of byte is " + squareNumber(byteParam));

			short shortParam = 320;
		System.out.println("Square of short is " + squareNumber(shortParam));
			
		int intParam = 1320;
		System.out.println("Square of int is " + squareNumber(intParam));
			
			long longParam = 34320;
			System.out.println("Square of long is " + squareNumber(longParam));
		
			float floatParam = 343.45F;
			System.out.println("Square of float is " + squareNumber(floatParam));
		
			double doubleParam = 1343.65;
			System.out.println("Square of double is " + squareNumber(doubleParam));
			
		}
		
	public static int squareNumber(byte num) {
			return num * num;
	}
		
	public static int squareNumber(short num) {
			return num * num;
		}
	
		public static long squareNumber(int num) {
		return num * num;
		}
		
		public static long squareNumber(long num) {
		return num * num;
		}
		
		public static double squareNumber(float num) {
		return num * num;
		}
		
		public static double squareNumber(double num) {
			return num * num;
	}
}


=====================================================================================================
	public class MethodOverloadingExample2 {

	public static void main(String[] args) {
		System.out.println("Sum of two integers is " + sum(45, 87));
		System.out.println("Sum of two integers is " + sum(45, 87, 67));
		System.out.println("Sum of two integers is " + sum(45, 87, 56, 45));
		System.out.println("Sum of two integers is " + sum(45, 65, 87, 56, 45));
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static long sum(int num1, int num2, int num3) {
		return sum(num1, num2) + num3;
	}
	
	public static long sum(int num1, int num2, int num3, int num4) {
		return sum(num1, num2, num3) + num4;
	}
	
	public static long sum(int num1, int num2, int num3, int num4, int num5) {
		return sum(num1, num2, num3, num4) + num4;
	}
}
