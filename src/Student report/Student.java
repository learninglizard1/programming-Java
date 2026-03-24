// Sachin Bade | Student no. 5117566 | BIT504 ASSIGNMENT 1

// Student class
public class Student {
		
	private String studentID, firstName, lastName;
	private int mathematics, art, history, science, geography, economics, literature;
	
	// constructor 
	public Student(String studentID, String fName, String lName, int mathematics, int art, int history, int science, int geography, int economics, int literature) {
		this.studentID = studentID;
		this.firstName = fName;
		this.lastName = lName;
		this.mathematics = mathematics;
		this.art = art;
		this.history = history;
		this.science = science;
		this.geography = geography;
		this.economics = economics;
		this.literature = literature;
	}	
	
	// getter and setter for student ID
	public String getID() {
		return studentID;
	}
	
	public void setID(String studentID) {
		this.studentID = studentID;
	}
	
	// getter and setter for full name
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public void setName(String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
	}
	
	// getter and setter for mathematics
	public int getMathematics() {
		return mathematics;
	}
	
	public void setMathematics(int mark) {
		this.mathematics = mark;
	}
	
	// getter and setter for art
	public int getArt() {
		return art;
	}
	
	public void setArt(int mark) {
		this.art = mark;
	}
	
	// getter and setter for history
	public int getHistory() {
		return history;
	}
	
	public void setHistory(int mark) {
		this.history = mark;
	}
	
	// getter and setter for science
	public int getScience() {
		return science;
	}
	
	public void setScience(int mark) {
		this.science = mark;
	}
	
	// getter and setter for geography
	public int getGeography() {
		return geography;
	}
	
	public void setGeography(int mark) {
		this.geography = mark;
	}
	
	// getter and setter for economics
	public int getEconomics() {
		return economics;
	}
	
	public void setEconomics(int mark) {
		this.economics = mark;
	}
	
	// getter and setter for literature
	public int getLiterature() {
		return literature;
	}
	
	public void setLiterature(int mark) {
		this.literature = mark;
	}
	
	// Average score
	public int getAverage() {
		double total = (mathematics + art + history + science + geography + economics + literature) ;
	return (int) Math.round(total/ 7.0);
	}
	
	
}


