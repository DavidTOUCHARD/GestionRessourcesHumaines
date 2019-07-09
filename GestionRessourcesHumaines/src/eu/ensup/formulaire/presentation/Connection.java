package eu.ensup.formulaire.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.ensup.formulaire.dao.Login;
import eu.ensup.formulaire.dao.SalarieDao;
import eu.ensup.formulaire.domaine.Salarie;

/**
 * Servlet implementation class Connection
 */
@WebServlet("/Connection")
public class Connection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(Connection.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Connection() {
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

		Connection.LOGGER.debug("Appel à DoGet pour charger la liste des Formations");
		String idSalarie = request.getParameter("id");

		if (!idSalarie.isEmpty()) {
			request.setAttribute("id", idSalarie);
			request.setAttribute("listeSalarie", new SalarieDao().listeDesFormations());
			request.getRequestDispatcher("success.jsp").forward(request, response);
		} else {

			RequestDispatcher rs = request.getRequestDispatcher("error.jsp");
			rs.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("oui");

		String id = request.getParameter("loginuser");
		String password = request.getParameter("mdpuser");

		Salarie salarie = new Salarie();

		List<Salarie> SalarieList = new ArrayList<Salarie>();

		SalarieList = Login.loginSalarie(id, password);

		if (!SalarieList.isEmpty()) {
			request.setAttribute("id", SalarieList.get(0).getId());
			request.setAttribute("listeFormation", new SalarieDao().listeDesFormations());
			RequestDispatcher rs = request.getRequestDispatcher("success.jsp");
			rs.forward(request, response);

		} else {

			RequestDispatcher rs = request.getRequestDispatcher("error.jsp");
			rs.include(request, response);

		}
	}

}
