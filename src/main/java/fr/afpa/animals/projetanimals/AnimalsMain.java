package fr.afpa.animals.projetanimals;

import java.util.ArrayList;

public class AnimalsMain {

	public static void main(String[] args) {

		//Instancitation des objets
		
		Animals mammal1 = new Mammal("Baleine", "Fonds marins", "brun");
		//System.out.println(mammal1);
		//mammal1.displayLocomotionType();

		Animals bird1 = new Bird("Pigeon", "savane", "10 cm");
		//System.out.println(bird1);
		//bird1.displayLocomotionType();

		Animals fish1 = new Fish("Lieu", "Fonds marins", "50 cm");
		//System.out.println(fish1);
		//fish1.displayLocomotionType();

		// Liste des animaux par types
		ArrayList<Animals> animalsList = new ArrayList<Animals>();
		animalsList.add(mammal1);
		animalsList.add(bird1);
		animalsList.add(fish1);
		
		for (Animals animals: animalsList){
			System.out.println(animals);
			animals.displayLocomotionType(); 
		}
	}

}
