package Dao;


	
	/**
	 *
	 * @author Lakshmi
	 */

	import java.sql.Connection;
	import java.sql.Statement;


	import Bean.DeleteStudentBean;
	import Connect.DBConnection;
	
	public class DeleteStudentDao {

		
		public String Delete(DeleteStudentBean StudentBean) // To insert data into Database for signup
		{
	            String StudentName=StudentBean.getStudentName();
			int status;

		try {

			Connection con = DBConnection.createConnection();
				System.out.println("1111");
	                      Statement st = con.createStatement();
			    String sql = "delete from Studentdetails where StudentId= '"+StudentName+"'";
			    int iCountDel = st.executeUpdate(sql);
			    
			    if (iCountDel != 0) {
			    	return "SUCCESS";
			    } else {
			    	return "UNSUCCESS";
			    }
				
			
			}
			catch(Exception e){}
			return "UNSUCCESS";
			
	}


	}


