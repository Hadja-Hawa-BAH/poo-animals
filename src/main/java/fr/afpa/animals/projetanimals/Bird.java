package fr.afpa.animals.projetanimals;

public class Bird extends Animals {
    // Attributs
    private String wingSpan;

    // Constructeurs

    public Bird(String species, String ecosystem, String wingSpan) {
        super(species, ecosystem);
        this.wingSpan = wingSpan;
    }

    // Getters/setters
    public String getWingSpan() {
        return wingSpan;
    }

    // Fonction
    @Override
    public String toString() {
        return super.toString()
                + "\nEnvergure de l'oiseau en cm: " + getWingSpan()
                + "\nLocomotion: vol";
    }

    // Fonction pour déterminer le type de déplacement
    @Override
    public void displayLocomotionType() {
        System.out.println("vol");
    }

}
