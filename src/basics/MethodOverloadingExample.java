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


=====================================================================================================



public class MethodOverloadingExample2 {

	public static void main(String[] args) {
		System.out.println("Sum of two integers is " + sum(45, 87));
		System.out.println("Sum of three integers is " + sum(45, 87, 67));
		System.out.println("Sum of four integers is " + sum(45, 87, 56, 45));
		System.out.println("Sum of five integers is " + sum(45, 65, 87, 56, 45));
		
		System.out.println();
		System.out.println();
		
		System.out.println("Sum of two decimals is " + sum(45.5F, 87.4F));
		System.out.println("Sum of three decimals is " + sum(45.4F, 87.1F, 67.04F));
		System.out.println("Sum of four decimals is " + sum(45.3F, 87.04F, 56.005F, 45.45F));
		System.out.println("Sum of five decimals is " + sum(45.001F, 65.08F, 87.245F, 56.005F, 45.90F));
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
	
	public static double sum(float num1, float num2) {
		return num1 + num2;
	}
	
	public static double sum(float num1, float num2, float num3) {
		return sum(num1, num2) + num3;
	}
	
	public static double sum(float num1, float num2, float num3, float num4) {
		return sum(num1, num2, num3) + num4;
	}
	
	public static double sum(float num1, float num2, float num3, float num4, float num5) {
		return sum(num1, num2, num3, num4) + num4;
	}
}
