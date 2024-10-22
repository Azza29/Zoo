package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

 
    public Animal(String family, String name, int age, boolean isMammal) {
        if (age < 0) {
            System.out.println("L'âge ne peut pas être négatif");
        }
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getType() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Animal: " + name + ", Family: " + family + ", Age: " + age + ", Mammal: " + isMammal;
    }

    public String getName() {
        return this.name;
    }

   }
