Classe Cours

```java
// Fichier : Cours.java
class Cours {
    private String code;
    private String intitule;
    private int credits;

    public Cours(String code, String intitule, int credits) {
        this.code = code;
        this.intitule = intitule;
        this.credits = credits;
    }

    public String getCode() { return code; }
    public String getIntitule() { return intitule; }
    public int getCredits() { return credits; }

    @Override
    public String toString() {
        return "[" + code + "] " + intitule + " (" + credits + " Crédits)";
    }
}