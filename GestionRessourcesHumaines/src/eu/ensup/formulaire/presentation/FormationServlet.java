package eu.ensup.formulaire.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.ensup.formulaire.dao.SalarieDao;

/**
 * Servlet implementation class CompteServlet
 */
@WebServlet("/CompteServlet")
public class FormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("servlet compte");
		String id = request.getParameter("id");
		System.out.println("id est : " + id);

		SalarieDao SalarieDao = new SalarieDao();
		// ArrayList<Compte> reponse = SalarieDao.listeDesComptes(id);
		//
		// if (reponse.size() > 0) {
		// request.setAttribute("listeComptes", reponse);
		// RequestDispatcher rs = request.getRequestDispatcher("compte.jsp");
		// rs.forward(request, response);
		//
		// } else {
		// RequestDispatcher rs = request.getRequestDispatcher("404.jsp");
		// rs.forward(request, response);
		// }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
