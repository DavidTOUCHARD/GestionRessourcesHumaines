package eu.ensup.formulaire.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.ensup.formulaire.domaine.Formation;
import eu.ensup.formulaire.domaine.Salarie;

public class SalarieDao extends AccesBd {

	private static final Logger LOGGER = LoggerFactory.getLogger(SalarieDao.class);
	ResultSet rs = null;

	public Salarie afficherInfoFormation(int id) {
		// TODO Auto-generated method stub
		Salarie salarie = new Salarie();

		AccesBd.seConnecter();
		try {
			ResultSet result = AccesBd.seConnecter()
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM salarie WHERE id = " + id);
			if (result.first()) {
				salarie = new Salarie(id, result.getString("nom"), result.getString("prenom"),
						result.getString("email"), result.getString("fonction"), result.getString("date_embauche"),
						result.getString("password"));
			}
		} catch (SQLException e) {
			SalarieDao.LOGGER.error("Erreur pendant l'affichage du client en BDD.", e);
		}
		this.seDeconnecter();
		return salarie;
	}

	public boolean creationFormation(Formation newFormation, String idSalarie) {
		// TODO A deplacer pour etre utilisee uniquement par le service RH
		AccesBd.seConnecter();
		try {
			String sql = "INSERT INTO salarie(`id`,`nom`,`theme`) values" + "('" + newFormation.getId() + "','"
					+ newFormation.getNom() + "','" + newFormation.getTheme() + "');";

			AccesBd.st.executeUpdate(sql);
			// sql = "INSERT INTO client (`idSalarie`,`idConseiller`) values
			// ('" + salarie.getId() + "','" + idConseiller
			// + "');";
			// AccesBd.st.executeUpdate(sql);

		} catch (SQLException e) {
			SalarieDao.LOGGER.error("Erreur pendant la création du client en BDD.", e);
			return false;
		}
		this.seDeconnecter();
		return true;

	}

	public ArrayList<Formation> listeDesFormations() {

		String id;
		String nom;
		String theme;
		ArrayList<Formation> listeFormation = new ArrayList<Formation>();

		AccesBd.seConnecter();
		try {

			String sql = "SELECT * from formation";

			this.rs = AccesBd.st.executeQuery(sql);

			while (this.rs.next()) {

				id = this.rs.getString("id_formation");
				nom = this.rs.getString("nom");
				theme = this.rs.getString("theme");

				Formation formation = new Formation(id, nom, theme);
				System.out.println(formation.getId() + formation.getNom() + formation.getTheme());
				listeFormation.add(formation);
			}
			Formation f2 = new Formation("12", "abc", "defg");
			listeFormation.add(f2);
			System.out.println("LISTE DES FORMATIONS : " + listeFormation);

		} catch (SQLException e) {
			// TODO: handle exception
			SalarieDao.LOGGER.error("Erreur pendant l'affichage des formations de la BDD.", e);
			return null;
		}

		this.seDeconnecter();
		return listeFormation;
	}

}