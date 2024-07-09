package fr.afpa.animals.projetanimals;

abstract public class Animals {

    // Attributs
    private String species;
    private String ecosystem;

    // Constructeur
    public Animals(String species, String ecosystem) {
        this.species = species;
        this.ecosystem = ecosystem;

    }

    // Getters/setters
    public String getSpecies() {
        return species;
    }

    public String getEcosystem() {
        return ecosystem;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setEcosystem(String ecosystem) {
        this.ecosystem = ecosystem;
    }

    // Fonction to string
    @Override
    public String toString() {
        return "\nAnimals {"
                + "\nEspèces: " + getSpecies()
                + "\nEcosystème: " + getEcosystem()
                + "}";
    }

    // Fonction pour déterminer le type de déplacement
    abstract public void displayLocomotionType();

}
