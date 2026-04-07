// reading file examples

import java.io.File;
import java.io.FileInputStream;

public class ReadFileExample1 {
	// We add "throws Exception" to catch any errors that occur with files
	public static void main(String[] args) throws Exception {

		// Access the file "source.txt" in the same directory as the program
		File file = new File("C:/Temp/source.txt");

		// Declare a variable for the FileInputStream
		FileInputStream stream = new FileInputStream(file);
		
		// Declare a buffer to store the data from the file into
		StringBuffer buffer = new StringBuffer();

		System.out.println("Size of file in bytes: " + stream.available());

		int data;
		// Continue looping until there is no more data to read from the file
		while ((data = stream.read()) != -1) {
			buffer.append((char) data);
		}

		// Close the stream and free up file access and memory
		stream.close();

		// Output the information using the buffer
		System.out.println("Content: " + buffer);
	}
}

=====================================================================================
import java.io.File;
import java.io.FileInputStream;

public class ReadFileExample2 {
	// We add "throws Exception" to catch any errors that occur with files
	public static void main(String[] args) throws Exception {
		File file = new File("C:/Temp/source.txt");
		FileInputStream stream = new FileInputStream(file);
		StringBuffer buffer = new StringBuffer();
		;
		int[] numbers = new int[5];
		int counter = 0;
		int data;
		while ((data = stream.read()) != -1) {
			if (((char)data) == ',') { // Comma has been found
				numbers[counter] = Integer.parseInt(buffer.toString());
				counter++; // Increase the counter by 1
				buffer.setLength(0);// Clear the buffer
			} else {
				buffer.append((char) data); // Add character to the buffer
			}
		}
		stream.close();

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Index " + i + " = " + numbers[i]);
		}
	}
}
