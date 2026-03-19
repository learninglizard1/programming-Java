public class DataConversion{
	public static void main(String[] args) {
		float float1 = 32.334f;
		byte myByte1 = (byte) float1;
		
		int num2 = 285;
		
		String text = "345.76";
		float myFloat = Float.parseFloat(text);
		
		String text2 = "Joe";
		
		double num = 897654.9876;
		
		
		System.out.println("The converted numbers are: \n" + myByte1 + " \n" + myFloat);
		System.out.println("The characters and numbers that were not converted are: \n" + num2 + " \n" + text2 + " \n" + num  );
	}
}
