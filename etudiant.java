// --- CLASSE ETUDIANT ---
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
        this.coursSuivis.add(cours);
    }

    public void afficherInfos() {
        System.out.println("\nÉtudiant: " + prenom + " " + nom + " (Matricule: " + matricule + ")");
        System.out.println("Cours suivis :");
        if (coursSuivis.isEmpty()) {
            System.out.println(" - Aucune inscription.");
        } else {
            for (Cours c : coursSuivis) {
                System.out.println(" - " + c);
            }
        }
    }
}