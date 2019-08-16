package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.AddStudents;
import Dao.AddStudentsDao;




@WebServlet(urlPatterns="/Admin" ,name="AddStudentServlet") 
public class AddStudentServlet extends HttpServlet

{

public AddStudentServlet() {
 }

protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
{
														//getting value for registration of in html details
	try {
		
		String StudentId= request.getParameter("StudentId");
        String StudentName= request.getParameter("StudentName");
		String Password = request.getParameter("Password");
		String CPGA= request.getParameter("CPGA");
		String Skills = request.getParameter("Skills");
		String Email= request.getParameter("Email");
		String MobileNo= request.getParameter("MobileNo");
		
		
		System.out.println("11111111111");
		AddStudents ConfirmBean = new AddStudents();
		ConfirmBean.setStudentIde(StudentId);
		ConfirmBean.setStudentName(StudentName);
		ConfirmBean.setPassword(Password);
		ConfirmBean.setCPGA( CPGA);
		ConfirmBean.setSkills(Skills);
		ConfirmBean.setEmail(Email);
		ConfirmBean.setMobileNo(MobileNo);
		
		
		
		System.out.println("22222");
		AddStudentsDao adddao=new AddStudentsDao();
		String validation = adddao.authenticateUser(ConfirmBean);
		System.out.println("33333");
		if(validation =="")
		
		{ request.setAttribute("insert", true);
		request.getRequestDispatcher("index.html").forward(request, response);
		System.out.println("4444");
		}
		else
		{ request.setAttribute("insert", false);
		request.getRequestDispatcher("AdminHomePage.jsp").forward(request, response);
		}
	}
		catch(Exception e)
		{
			
		

	}
}

}
	
