public class Redacteur {
	// Attributs.
	private String nom;
	private String prenom;

	// Constructeur.
	public Redacteur(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	// Méthodes.
	@Override
	public String toString() {
		return prenom + " " + nom;
	}
}
