package Package_IT;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * Servlet implementation class ProfilesShowInfo
 */
public class ProfilesShowInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfilesShowInfo() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		ArrayList<User> users = UserCollection.getInstance().getArray(); 
		HttpSession session=request.getSession();
		session.setAttribute("list", users); 
		response.sendRedirect("ListProfils.jsp");
		*/
		
		
		ArrayList<User> users = UserCollection.getInstance().getArray(); 
		HttpSession session=request.getSession();
		
		String myTestFile = "C:\\Users\\svetl\\eclipse-workspace\\IT_LoginForm_IT\\users.xml";
		
		try {
		JAXBContext context = JAXBContext.newInstance(Group.class);
		    Unmarshaller um = context.createUnmarshaller();
			Group group = (Group) um.unmarshal(new FileReader(myTestFile));
			users.clear();
			users = group.getUsers();
			session.setAttribute("list", users); 
			response.sendRedirect("ListProfils.jsp");
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
