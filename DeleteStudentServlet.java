package Controller;


	/**
	 *
	 * @author Lakshmi
	 */
	import java.io.IOException;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;

	import Bean.DeleteStudentBean;
	import Dao.DeleteStudentDao;

	/**
	 * Servlet implementation class Delete_Book_Servlet
	 */
	@WebServlet(urlPatterns="/DeleteMedicine",name="DeleteStudentServlet")
	public class DeleteStudentServlet  extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public DeleteStudentServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String StudentName=request.getParameter("medicine");
			System.out.println("in servlet"+StudentName);
			DeleteStudentBean medicineBean = new DeleteStudentBean();

			System.out.println(" before"+StudentName);
			medicineBean.setStudentName(StudentName);
			System.out.println("after");
			DeleteStudentDao userdao = new DeleteStudentDao();
			System.out.println("123");
			String userRegistered = userdao.Delete(medicineBean);
			System.out.println(userRegistered);
			if (userRegistered.equals("SUCCESS")) // On success, you can display a message to user on Home page
			{
				System.out.println("in if");
				//request.setAttribute("Admin_Menu", true);
				HttpSession session = request.getSession(false); 
				request.getRequestDispatcher("/AdminHome.jsp").forward(request, response);
			} else // On Failure, display a meaningful message to the User.
			{
				System.out.println("in else");
				
				request.setAttribute("errMessage", userRegistered);
				request.getRequestDispatcher("/AdminHomePage.jsp").forward(request, response);
			}
		}
	}
