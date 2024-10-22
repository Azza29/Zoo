package tn.esprit.gestionzoo.entities;

public abstract class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public abstract void swim();
       

    public float getSwimmingDepth() {
        return swimmingDepth;
    }
}
