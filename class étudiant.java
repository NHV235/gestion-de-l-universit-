import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Etudiant {
    private String nom;
    private String prenom;
    private String matricule;
    private List<Cours> coursSuivis;

    public Etudiant(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.coursSuivis = new ArrayList<>();
    }

    public void inscrireCours(Cours cours) {
        if (cours != null && !coursSuivis.contains(cours)) {
            coursSuivis.add(cours);
        }
    }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getMatricule() { return matricule; }

    public List<Cours> getCoursSuivis() {
        return Collections.unmodifiableList(coursSuivis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nÉtudiant: ").append(prenom).append(" ").append(nom)
          .append(" (Matricule: ").append(matricule).append(")\n")
          .append("Cours suivis :\n");
        if (coursSuivis.isEmpty()) {
            sb.append(" - Aucune inscription.");
        } else {
            for (Cours c : coursSuivis) {
                sb.append(" - ").append(c).append("\n");
            }
        }
        return sb.toString();
    }
}