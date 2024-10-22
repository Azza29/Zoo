package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private Animal[] aquaticAnimals;
    private String name;
    private String city;
    public final int NBR_CAGES;  
    private int animalCount;     
    private int aquaticAnimalCount;

    public Zoo(String name, String city, int nbrCages) {
        if (name == null) {
                System.out.println("Le nom du zoo ne peut pas être vide");
        }
        this.name = name;
        this.city = city;
        this.NBR_CAGES = nbrCages;
        this.animals = new Animal[NBR_CAGES]; 
        this.aquaticAnimals = new Aquatic[10];  
        this.animalCount = 0;
        this.aquaticAnimalCount = 0; 
    }

    public void addAquaticAnimal(Aquatic aquatic) {
    if (aquaticAnimalCount >= 10) {
        System.out.println("Le zoo est plein des animaux aquatiques, avec un nombre total de " + this.aquaticAnimalCount);
    } else {
        aquaticAnimals[aquaticAnimalCount] = aquatic;
        aquaticAnimalCount++;
        System.out.println("Animal aquatiques ajouté avec succès");
    }

    }
    public void displayAquaticAnimals() {
        System.out.println("Animaux aquatiques du zoo " + name + ":");
        for (int i = 0; i < aquaticAnimalCount; i++) {
            ((Aquatic) aquaticAnimals[i]).swim();
        }
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < aquaticAnimalCount; i++) {
            if (aquaticAnimals[i].getType() != null) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
    
        for (int i = 0; i < aquaticAnimalCount; i++) {
            if (aquaticAnimals[i].getType() == "Dolphin") {
                dolphinCount++;
            } else if (aquaticAnimals[i].getType() == "Penguin" ) {
                penguinCount++;
            }
        }
    
           }
    
    
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein. Impossible d'ajouter l'animal.");
            return false;
        }

        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal existe déjà dans le zoo.");
            return false;
        }

        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    public void displayAnimals() {
        System.out.println("Animaux du zoo " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i; 
            }
        }
        return -1;  
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("L'animal n'existe pas dans le zoo.");
            return false;
        }

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null; 
        animalCount--;
        return true;
    }

    public boolean isZooFull() {
        return animalCount >= NBR_CAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else {
            return z2;
        }
    }

    public String getName() {
        return this.name;
    }

    public void displayZoo() {
        System.out.println("Zoo name: " + this.name);
        System.out.println("City: " + this.city);
        System.out.println("Number of cages: " + this.NBR_CAGES);
    }

    @Override
    public String toString() {
        return "Zoo name: " + this.name + ", City: " + this.city + ", Number of cages: " + this.NBR_CAGES;
    }
}
