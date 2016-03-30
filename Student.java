public class Student {
	private String firstname;
	private String lastname;
	private String studentID;
	private SimpleDate enrolDate;

	public SimpleDate getEnrolDate() {
		return enrolDate;
	}

	public void setEnrolDate(SimpleDate enrolDate) {
		this.enrolDate = enrolDate;
	}

	Student(String fn, String ln, String id) {
		this.setFirstname(fn);
		this.setLastname(ln);
		this.setStudentID(id);
	}

	Student(String id) {
		this.setFirstname("UNKNOWN");
		this.setLastname("UNKNOWN");
		this.setStudentID(id);
	}
	Student(String fn, String ln, String id, SimpleDate aDate){
		this.setFirstname(fn);
		this.setLastname(ln);
		this.setStudentID(id);
		this.setEnrolDate(aDate);
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String toString() {
		return "Student's first name: " + this.getFirstname() + ", last name: "
				+ this.getLastname() + ", ID: " + this.getStudentID();
	}

}
