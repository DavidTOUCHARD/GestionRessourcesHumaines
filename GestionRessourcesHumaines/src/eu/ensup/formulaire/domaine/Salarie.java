package eu.ensup.formulaire.domaine;

public class Salarie {

	int id;
	String password;
	String nom;
	String prenom;
	String email;
	String fonction;
	String date_embauche;

	public Salarie() {
		// TODO Auto-generated constructor stub
	}

	public Salarie(int id, String date_embauche, String password, String email, String fonction, String nom,
			String prenom) {
		super();
		this.id = id;
		this.date_embauche = date_embauche;
		this.password = password;
		this.email = email;
		this.fonction = fonction;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getDate_embauche() {
		return this.date_embauche;
	}

	public String getEmail() {
		return this.email;
	}

	public String getFonction() {
		return this.fonction;
	}

	public int getId() {
		return this.id;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPassword() {
		return this.password;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setDate_embauche(String date_embauche) {
		this.date_embauche = date_embauche;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Salarie [id=" + this.id + ", password=" + this.password + ", nom=" + this.nom + ", prenom="
				+ this.prenom + ", email=" + this.email + ", fonction=" + this.fonction + ", date_embauche="
				+ this.date_embauche + "]";
	}

}
