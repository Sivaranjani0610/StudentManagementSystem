package student.management.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import student.management.model.InactiveStudents;
import student.management.model.Student;

public class StudentDao {
	
	Connection con = null;
	 @Autowired
	  DataSource datasource;

	  @Autowired
	  JdbcTemplate jdbcTemplate;
	  
	 
	public void setTemplate(JdbcTemplate template) {
		this.jdbcTemplate = template;
	}

	public int addnewstud(Student stu) {
		String sql = "insert into students(firstname,surname,year,dateofbirth,schoolname,guardianname,guardianno,address) values('" + stu.getFirstname() + "','" + stu.getSurname() + "','" + stu.getYear() + "','" + stu.getDateofbirth() + "','" + stu.getSchoolname() + "','" + stu.getGuardianname() + "','" + stu.getGuardianno() + "','" + stu.getAddress() + "')";
		return jdbcTemplate.update(sql);
	}

	public int newstudupdate(Student stu) {
		String sql = "Update students set firstname='" + stu.getFirstname() + "',surname='" + stu.getSurname()
				+ "',year='" + stu.getYear() + "',dateofbirth='" + stu.getDateofbirth() + "',schoolname='" + stu.getSchoolname() + "',guardianname='" + stu.getSchoolname() + "',guardianno='" + stu.getGuardianno() + "',address='" + stu.getAddress() + "' where studentid=" + stu.getStudentid();
		return jdbcTemplate.update(sql);
	}

	
	public int deletestudent(int studentid) {
		String sql = "delete from students where studentid=" + studentid;
		return jdbcTemplate.update(sql);
	}
	
	public int deletedeativatestudents(int studentid) {
		String sql = "delete from deativatestudents where studentid=" + studentid;
		return jdbcTemplate.update(sql);
	}
	
	
	
	public int insert(int studentid) {
		String sql = "insert into deativatestudents(firstname,surname,year,dateofbirth,schoolname,guardianname,guardianno,address) select firstname,surname,year,dateofbirth,schoolname,guardianname,guardianno,address from students where studentid=" + studentid;		
		return jdbcTemplate.update(sql);
	}
	
	
	public Student getStudentById(int studentid) {
		String sql = "select * from students where studentid=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { studentid }, new BeanPropertyRowMapper<Student>(Student.class));
	}

	public List<Student> getAllStudents() {
		return jdbcTemplate.query("select * from students", new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int row) throws SQLException {
				Student prod = new Student();
				prod.setStudentid(rs.getInt(1));
				prod.setFirstname(rs.getString(2));
				prod.setSurname(rs.getString(3));
				prod.setYear(rs.getInt(4));
				prod.setDateofbirth(rs.getString(5));
				prod.setSchoolname(rs.getString(6));
				prod.setGuardianname(rs.getString(7));
				prod.setGuardianno(rs.getString(8));
				prod.setAddress(rs.getString(9));

				return prod;
			}
		});
	}
	public List<InactiveStudents> getInactiveStudents() {
		return jdbcTemplate.query("select * from deativatestudents", new RowMapper<InactiveStudents>() {
			public InactiveStudents mapRow(ResultSet rs, int row) throws SQLException {
				InactiveStudents ca = new InactiveStudents();
				ca.setStudentid(rs.getInt(1));
				ca.setFirstname(rs.getString(2));
				ca.setSurname(rs.getString(3));
				ca.setYear(rs.getInt(4));
				ca.setDateofbirth(rs.getString(5));
				ca.setSchoolname(rs.getString(6));
				ca.setGuardianname(rs.getString(7));
				ca.setGuardianno(rs.getString(8));
				ca.setAddress(rs.getString(9));

				return ca;
			}
		});
	}
	
}