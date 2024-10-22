package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    private String family;
    private String habitat;
    private String name;
    private int age;
    private boolean isMammal;
    

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.name = name;
        this.age = age;
        this.family = family;
        this.isMammal = isMammal;
        this.habitat = habitat;
    }
    public abstract void swim();
    
    @Override
     public abstract String getType(); 

}
