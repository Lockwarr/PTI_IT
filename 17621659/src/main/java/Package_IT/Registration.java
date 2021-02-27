package Package_IT;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	   		
		String name = request.getParameter("name");
    	String username = request.getParameter("username");	
    	String pass1 = request.getParameter("password1");
    	String pass2 = request.getParameter("password2");	
    	String phone = request.getParameter("phone");	
    	String city = request.getParameter("city");	
    	String address = request.getParameter("address");	
  	
    	       	
	    if(name.equals("")) {
	    	out.println("<script type=\"text/javascript\">"+"alert('Please,enter your name!');"+"location='Registration.html';</script>");
	    } else if (username.equals("")) {
	    	out.println("<script type=\"text/javascript\">"+"alert('Please,enter your nickname!');"+"location='Registration.html';</script>");
	    } else if (pass1.equals("")) {
	    	out.println("<script type=\"text/javascript\">"+"alert('Please,enter your password!');"+"location='Registration.html';</script>");
	    } else if (pass2.equals("")) {
	    	out.println("<script type=\"text/javascript\">"+"alert('Please,enter your password confirm!');"+"location='Registration.html';</script>");
	    } else if (phone.equals("")) {
	    	out.println("<script type=\"text/javascript\">"+"alert('Please,enter your nickname!');"+"location='Registration.html';</script>");
	    }else if (city.equals("")) {
	    	out.println("<script type=\"text/javascript\">"+"alert('Please,enter your nickname!');"+"location='Registration.html';</script>");
	    }else if (address.equals("")) {
	    	out.println("<script type=\"text/javascript\">"+"alert('Please,enter your nickname!');"+"location='Registration.html';</script>");
	    }else if (!pass1.equals(pass2)) {
	    	out.println("<script type=\"text/javascript\">"+"alert('Your passwords are different!');"+"location='Registration.html';</script>");
	    } else if (pass1.length() < 8 || pass2.length() < 8) {
	    	out.println("<script type=\"text/javascript\">"+"alert('Your password is less than 8 symbols!');"+"location='Registration.html';</script>");
	    }
	    
	    
	    else {
	    	XmlUsers gp = new XmlUsers();
	    	gp.setUsers(UserCollection.getInstance().getArray());
	    	if(gp.getUsers().size() == 0) {
	    		User user1 = new User(1, "test1@abv.bg", "21111111", "1111111111", "Varna", "Ulica");
	    		User user2 = new User(2, "test2@abv.bg", "31111111","1111111112", "Burgas", "Asparuh");
	    		User user3 = new User(3, "test3@abv.bg", "41111111","1111111113", "Shumen", "Jechka");
	    		UserCollection.getInstance().getArray().add(user1); 
	    		UserCollection.getInstance().getArray().add(user2); 
	    		UserCollection.getInstance().getArray().add(user3); 
	    		gp.setUsers(UserCollection.getInstance().getArray());
	    	}
	    	System.out.println(gp.getUsers().size());
	    	int j = UserCollection.getInstance().getArray().size()+1;
	    	User user22 = new User(j,username, pass1, phone, city, address);
	    	UserCollection.getInstance().getArray().add(user22); 
	    	
	    	String myTestFile = "D\\:\\\\repos\\\\Eclipse\\\\17621659\\\\CollectionXml.xml";
	    	try {
		        JAXBContext context = JAXBContext.newInstance(XmlUsers.class);
		        Marshaller m = context.createMarshaller();
		        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		        m.marshal(gp, System.out);
	    		m.marshal(gp, new File(myTestFile));
				} catch (JAXBException e) {
					e.printStackTrace();
				}
	    	
	    	out.println("<script type=\"text/javascript\">"+"location='Login.html';</script>");
	    	
	    }
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("Registration.html");
	}
}
