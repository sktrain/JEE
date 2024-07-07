package sk.train;

import java.io.IOException;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import sk.train.beans.ApplicationBean;

/**
 * Servlet implementation class Starter
 */
@WebServlet("/Starter")
public class Starter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ApplicationBean ab;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Starter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath()).append('\n').append(ab.toString());
	}

}
