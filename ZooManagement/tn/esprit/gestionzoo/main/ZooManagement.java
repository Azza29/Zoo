package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        // Création d'un zoo
        Zoo myZoo = new Zoo("My Zoo", "My City", 25);
        
        // Création d'animaux
        Animal lion = new Animal("Feline", "Lion", 5, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        Animal tiger = new Animal("Feline", "Tiger", 3, true);
        // Ajout d'animaux dans le zoo
        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(tiger);

        // Affichage des animaux dans le zoo
        myZoo.displayAnimals();

        // Suppression d'un animal
        myZoo.removeAnimal(lion);

        // Affichage des animaux après suppression
        myZoo.displayAnimals();

        // Comparaison de deux zoos
        Zoo anotherZoo = new Zoo("Safari Park", "Nairobi", 15);
        Animal giraffe = new Animal("Giraffidae", "Giraffe", 6, false);
        anotherZoo.addAnimal(giraffe);

        Zoo biggerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        System.out.println("\nLe zoo avec le plus d'animaux est : " + biggerZoo.getName());
    }
}
