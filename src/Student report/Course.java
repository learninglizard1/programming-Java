
// Course class
public class Course {
	
	private String courseName;
	private int mark;
	
	
	// constructor
	public Course(String courseName, int mark) {
		this.courseName= courseName;
		this.mark = mark;
	}
	
	// getter and setter for course name
	public String getCourseName() {
		return  courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	// getter and setter for mark
	public int getMark() {
		return mark;
	}
	
	public void setMark(int mark) {
		this.mark = mark;
	}
}
