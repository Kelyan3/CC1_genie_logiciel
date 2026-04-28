import java.util.List;

public class Question {
	// Attributs.
	private String titre;
	private List<Reponse> reponses;

	// Constructeurs.
	public Question(String titre, List<Reponse> reponses) {
		this.titre = titre;
		this.reponses = reponses;
	}

	// Getters.
	public String getTitre() { return titre; }
	public List<Reponse> getReponses() { return reponses; }

	// Méthodes.
	public boolean isBonneReponse(String saisieJoueur) {
		for (Reponse resp : reponses) {
			// Permet d'accepter les minuscules/majuscules.
			if (resp.getPosition().equalsIgnoreCase(saisieJoueur))
				return resp.getBonneReponse();
		}

		// Saisie incorrecte.
		return false;
	}
}
