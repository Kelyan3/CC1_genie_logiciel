public class Joueur {
	// Attributs.
	private String nom;
	private String prenom;

	// Constructeur.
	public Joueur(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	// Méthodes.
	@Override
	public String toString() {
		return nom + " " + prenom;
	}
}
