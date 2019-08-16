	package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.ParseException;

import Bean.AddStudents;
import Connect.DBConnection;





public class AddStudentsDao {

	public  String authenticateUser(AddStudents AddBean)
	{
		int status = 0;
		String StudentId= AddBean.getStudentId();
		String StudentName = AddBean.getStudentName();
		String Password = AddBean.getPassword();
		String CPGA = AddBean.getCPGA();
		String Skills= AddBean.getSkills();
		String Email= AddBean.getEmail();
		String MobileNo = AddBean.getMobileNo();
		
		
		try {
			Connection con = DBConnection.createConnection();
			PreparedStatement ps = con.prepareStatement("Insert into student(StudentId,StudentName,Password,CPGA,Skills,Email,MobileNo)values(?,?,?,?,?,?,?)");
					
			
			ps.setString(1, AddBean.getStudentId());
			ps.setString(2, AddBean.getStudentName());
			ps.setString(3, AddBean.getPassword());
			ps.setString(4, AddBean.getCPGA());
			ps.setString(5, AddBean.getSkills());
			ps.setString(6, AddBean.getMobileNo());
			
			status = ps.executeUpdate();
			return "success";
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		return "unsuccess";
		
	}
}
			
			
			
			
			
