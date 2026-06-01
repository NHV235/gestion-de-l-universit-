class Enseignant {
    private String nom;
    private String matricule;
    private List<Cours> coursAssignes;

    public Enseignant(String nom, String matricule) {
        this.nom = nom;
        this.matricule = matricule;
        this.coursAssignes = new ArrayList<>();
    }

    public void attribuerCours(Cours cours) {
        this.coursAssignes.add(cours);
    }

    public void afficherInfos() {
        System.out.println("\nEnseignant: " + nom + " (Matricule: " + matricule + ")");
        System.out.println("Liste des cours à dispenser :");
        if (coursAssignes.isEmpty()) {
            System.out.println(" - Aucun cours attribué.");
        } else {
            for (Cours c : coursAssignes) {
                System.out.println(" - " + c);
            }
        }
    }
}