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
