// package eu.ensup.formulaire.presentation;
//
// import java.io.IOException;
//
// import javax.servlet.RequestDispatcher;
// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
//
// import eu.ensup.formulaire.dao.SalarieDao;

/// **
// * Servlet implementation class Supression
// */
// @WebServlet("/Supression")
// public class SupressionServlet extends HttpServlet {
// private static final long serialVersionUID = 1L;
//
// /**
// * @see HttpServlet#HttpServlet()
// */
// public SupressionServlet() {
// super();
// // TODO Auto-generated constructor stub
// }
//
// /**
// * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
// * response)
// */
// @Override
// protected void doGet(HttpServletRequest request, HttpServletResponse
/// response)
// throws ServletException, IOException {
//
// System.out.println("servlet suppression");
// String idClient = request.getParameter("idClient");
// String id = request.getParameter("id");
// System.out.println("id est : " + idClient);
//
// SalarieDao salarieDao = new SalarieDao();
// boolean reponse = salarieDao.suppressionClient(idClient);
//
// if (reponse == true) {
// request.setAttribute("id", id);
// request.setAttribute("listePersonne", salarieDao.listeDesFormations());
// RequestDispatcher rs = request.getRequestDispatcher("success.jsp");
// rs.forward(request, response);
//
// } else {
// RequestDispatcher rs = request.getRequestDispatcher("error.jsp");
// rs.forward(request, response);
// }
// }
//
// /**
// * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
// * response)
// */
// @Override
// protected void doPost(HttpServletRequest request, HttpServletResponse
/// response)
// throws ServletException, IOException {
// // TODO Auto-generated method stub
//
// }
//
// }
