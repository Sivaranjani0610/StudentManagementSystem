package student.management.model;

public class Student {

	private int studentid;
	private String firstname;
	private String surname;
	private int year;
	private String dateofbirth;
	private String schoolname;
	private String guardianname;
	private String guardianno;
	private String address;
	

	public Student() {
		super();
	}

	public Student(String firstname,String surname,int year,String dateofbirth,String schoolname,String guardianname,String guardianno,String address) {
		super();
		this.firstname = firstname;
		this.surname = surname;
		this.year = year;
		this.dateofbirth = dateofbirth;
		this.schoolname = schoolname;
		this.guardianname = guardianname;
		this.guardianno = guardianno;
		this.address = address;
		
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public String getGuardianname() {
		return guardianname;
	}

	public void setGuardianname(String guardianname) {
		this.guardianname = guardianname;
	}

	public String getGuardianno() {
		return guardianno;
	}

	public void setGuardianno(String guardianno) {
		this.guardianno = guardianno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
}
