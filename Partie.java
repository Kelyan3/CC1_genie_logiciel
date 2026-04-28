public class Partie {
	// Attributs.
	private Quiz quiz;
	private Joueur joueur;
	private int score;

	// Constructeur.
	public Partie(Quiz quiz, Joueur joueur) {
		this.quiz = quiz;
		this.joueur = joueur;
		this.score = 0;
	}

	// Méthodes.
	public void ajouterScore() {
		this.score++;
	}
}
