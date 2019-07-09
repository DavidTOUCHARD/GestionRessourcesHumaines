package eu.ensup.formulaire.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.ensup.formulaire.domaine.Formation;
import eu.ensup.formulaire.service.SalarieService;

/**
 * Servlet implementation class AddClientServlet
 */
@WebServlet("/AddClientServlet")
public class AddFormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory.getLogger(AddFormationServlet.class);

	private SalarieService service;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddFormationServlet() {
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
		String idSalarie = request.getParameter("id");
		AddFormationServlet.LOGGER.debug("Appel à DoGet avec idSalarie --> {}", idSalarie);
		this.getServletContext().getRequestDispatcher("/addClient.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idFormation = request.getParameter("id");

		String nom = request.getParameter("nom");
		String theme = request.getParameter("theme");

		Formation newFormation = new Formation();
		newFormation.setId(RandomStringUtils.random(10, "azertyuiopqsdfghjklmwxcvbn23456789"));
		newFormation.setNom(nom != null && !nom.isEmpty() ? nom : null);
		newFormation.setTheme(theme != null && !theme.isEmpty() ? theme : null);

		AddFormationServlet.LOGGER.debug("Ajout du formation --> {} {} en base de données", nom, theme);
		boolean result = this.service.creationFormation(newFormation, idFormation);
		if (result) {
			request.setAttribute("isError", false);
			request.setAttribute("message", "La formation" + nom + theme + " a bien été enregistré en base ! ");
		} else {
			request.setAttribute("isError", true);
			request.setAttribute("message", "ERREUR : Le client" + nom + theme + " n'a pas été enregistré en base ! ");
		}
		// redirection vers la page success
		// response.sendRedirect(this.getServletContext().getContextPath() +
		// "/Connection?id=" + idSalarie);
		this.doGet(request, response);
	}

	@Override
	public void init() throws ServletException {
		this.service = new SalarieService();
	}

}
