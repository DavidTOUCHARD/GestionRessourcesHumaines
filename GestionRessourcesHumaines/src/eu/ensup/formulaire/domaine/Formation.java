package eu.ensup.formulaire.domaine;

public class Formation {

	String id;
	String nom;
	String theme;

	public Formation() {
		// TODO Auto-generated constructor stub
	}

	public Formation(String id, String nom, String theme) {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return this.id;
	}

	public String getNom() {
		return this.nom;
	}

	public String getTheme() {
		return this.theme;
	}

	public void setId(String string) {
		this.id = string;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	@Override
	public String toString() {
		return "Formation [id=" + this.id + ", nom=" + this.nom + ", theme=" + this.theme + "]";
	}
}
