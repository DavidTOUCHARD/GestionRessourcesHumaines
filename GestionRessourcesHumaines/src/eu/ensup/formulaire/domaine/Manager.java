package eu.ensup.formulaire.domaine;

public class Manager extends Salarie {
	int id;

	public Manager(int id, String date_embauche, String password, String email, String fonction, String nom,
			String prenom, int id2) {
		super(id, date_embauche, password, email, fonction, nom, prenom);
		id = id2;
	}

}
