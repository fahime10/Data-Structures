package lib;

public class Module {

	private String name;
	private int year;
	private int semester;
	private String lecturer;
	
	
	public Module(String n, int year, int semester, String l) {
		this.name = n;
		this.year = year;
		this.semester = semester;
		this.lecturer = l;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String year) {
		this.name = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int semester) {
		this.year = semester;
	}
	
	public int getSemester() {
		return semester;
	}
	
	public void setSemester(int n) {
		this.semester = n;
	}
	
	public String getLecturer() {
		return lecturer;
	}
	
	public void setLecturer(String n) {
		this.lecturer = n;
	}
	
	@Override
	public String toString() {
		return "Module:[ModuleName=" + name + ", year=" + year + ", semsester=" +
				semester + ", lecturer=" + lecturer + "]";
	}
	
}
