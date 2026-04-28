import java.util.ArrayList;
import java.util.List;

public class Quiz {
	// Attributs.
	private String nom;
	private Categorie categorie;
	private Redacteur redacteur;
	private List<Question> questions;

	// Constructeur.
	public Quiz(String nom, Categorie categorie, Redacteur redacteur) {
		this.nom = nom;
		this.categorie = categorie;
		this.redacteur = redacteur;
		this.questions = new ArrayList<>();
	}

	// Méthodes.
	public void ajouterQuestion(Question question) {
		this.questions.add(question);
	}

	@Override
	public String toString() {
		return nom;
	}
}
