package fr.afpa.animals.projetanimals;
public class Fish extends Animals {
    // Attributs
    private String preferredWaterDepth;

    // Constructeurs
    public Fish(String species, String ecosystem, String preferredWaterDepth) {
        super(species, ecosystem);
        this.preferredWaterDepth = preferredWaterDepth;
    }

    // Getters/setters
    public String getPreferredWaterDepth() {
        return preferredWaterDepth;
    }

    public void setPreferredWaterDepth(String preferredWaterDepth) {
        this.preferredWaterDepth = preferredWaterDepth;
    }

    // Fonction
    @Override
    public String toString (){
        return super.toString()
        + "\nla profondeur à laquelle le poisson vit en milieu naturel (valeur moyenne en cm): " + getPreferredWaterDepth()
        + "\nLocomotion: Nage";
    }

    //Fonction pour déterminer le type de déplacement
    @Override
    public void displayLocomotionType(){
       System.out.println(" Nage");
    } 
    
    
}
