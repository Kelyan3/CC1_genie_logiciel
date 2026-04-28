import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Categorie c1 = new Categorie("Géographie");
		//System.out.println(c1);

		Redacteur r1 = new Redacteur("Etienne", "Samuel");
		Redacteur r2 = new Redacteur("Lepers", "Julien");
		//System.out.println(r1);
		//System.out.println(r2);

		Joueur joueur1 = new Joueur("Lumdupen", "Jordan");

		boolean continuer = true;
		while (continuer) {
			Quiz quiz1 = new Quiz("Quiz1", c1, r1);

			Reponse repA_q1 = new Reponse("Osaka", false, "A");
			Reponse repB_q1 = new Reponse("Kyoto", false, "B");
			Reponse repC_q1 = new Reponse("Tokyo", true, "C");
			Reponse repD_q1 = new Reponse("Hiroshima", false, "D");
			List<Reponse> reponsesQ1 = List.of(repA_q1, repB_q1, repC_q1, repD_q1);

			Question q1 = new Question("Quelle est la capitale du Japon ?", reponsesQ1);
			quiz1.ajouterQuestion(q1);

			Partie nouvPartie = new Partie(quiz1, joueur1);

			System.out.println("\nNOUVELLE PARTIE");
			System.out.println("Joueur : " + joueur1 + " | Quiz : " + quiz1);
			System.out.println("Question : " + q1.getTitre());

			for (Reponse resp : q1.getReponses())
				System.out.println(resp.getPosition() + ") " + resp.getTexte());

			System.out.println("Quel est votre réponse ? (A, B, C, D)");
			String saisie = scanner.nextLine();

			if (q1.isBonneReponse(saisie)) {
				System.out.println("Bonne réponse ! Vous gagnez 1 point !");
				nouvPartie.ajouterScore();
			}
			else
				System.out.println("Mauvaise réponse !");

			System.out.println("Souhaitez-vous recommencer ? (O/N)");
			String respRecommencer = scanner.nextLine();
			if (!respRecommencer.equalsIgnoreCase("O"))
				continuer = false;
		}

		System.out.println("Fin de partie.");
	
		scanner.close();
	}
}
