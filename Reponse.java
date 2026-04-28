import java.util.ArrayList;
import java.util.List;

public class Reponse {
    // Attributs.
    private String texte;
    private boolean bonne_reponse;
    private String position;

    // Constructeur.
    public Reponse(String texte, boolean bonne_reponse, String position) {
        this.texte = texte;
        this.bonne_reponse = bonne_reponse;
        this.position = position;
    }

    // Getters.
    public String getTexte() { return texte; }
    public boolean getBonneReponse() { return bonne_reponse; }
    public String getPosition() { return position; }
}
