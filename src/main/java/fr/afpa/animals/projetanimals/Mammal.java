package fr.afpa.animals.projetanimals;

public class Mammal extends Animals {

    // Attributs
    private String furColor;

    // Constructeurs

    public Mammal(String species, String ecosystem, String furColor) {
        super(species, ecosystem);
        this.furColor = furColor;
    }

    // Getters/setters
    private String getFurColor() {
        return furColor;
    }

    private void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    // Fonction
    @Override
    public String toString() {
        return super.toString()
                + "\nFourrure: " + getFurColor()
                + "\nLocomotion: Marche/course/saut";
    }

    //Fonction pour déterminer le type de déplacement
    @Override
    public void displayLocomotionType() {
        System.out.println("Marche/course/saut");
    }
}
