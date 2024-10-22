package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Mon Zoo", "Tunisia", 5);

        System.out.println("Tous les animaux aquatiques nagent :");
        zoo.displayAquaticAnimals();

        
        System.out.println("Profondeur maximale des pingouins : " + zoo.maxPenguinSwimmingDepth());

       
        zoo.displayNumberOfAquaticsByType();
    }
}
