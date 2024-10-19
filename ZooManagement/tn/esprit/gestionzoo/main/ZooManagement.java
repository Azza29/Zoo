package tn.esprit.gestionzoo.main; 

import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin; 
import tn.esprit.gestionzoo.entities.Terrestrial; 


public class ZooManagement {
    public static void main(String[] args) {
        // créer des animaux aquatic + terrestrial 
        Dolphin dolphin = new Dolphin("Cetacea", "Dolphin", 8, true, "Ocean", 30.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Penguin", 4, true, "Antarctica", 20.0f);
        Terrestrial lion = new Terrestrial("Feline", "Lion", 5, true, 4);

        // Afficher details
        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(lion);

        // Tester la méthode swim 
        dolphin.swim();
        penguin.swim();
    }
}
