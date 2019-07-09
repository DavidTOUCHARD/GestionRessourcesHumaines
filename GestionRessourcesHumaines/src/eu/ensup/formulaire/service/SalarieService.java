package eu.ensup.formulaire.service;

import java.util.ArrayList;

import eu.ensup.formulaire.dao.SalarieDao;
import eu.ensup.formulaire.domaine.Formation;
import eu.ensup.formulaire.domaine.Salarie;

public class SalarieService {

	private SalarieDao salarieDao;

	public SalarieService() {
		this.salarieDao = new SalarieDao();
	}

	public Salarie afficherInfoClient(int id) {
		return this.salarieDao.afficherInfoFormation(id);
	}

	public boolean creationFormation(Formation newFormation, String idSalarie) {
		return this.salarieDao.creationFormation(newFormation, idSalarie);

	}

	public ArrayList<Formation> listeDesFormations() {
		return this.salarieDao.listeDesFormations();
	}

}
