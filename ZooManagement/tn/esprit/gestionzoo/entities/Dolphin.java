package tn.esprit.gestionzoo.entities;

public abstract class Dolphin extends Aquatic {
    private float swimmingDepth;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }


    @Override
    public abstract void swim();
       

    public float getSwimmingDepth() {
        return swimmingDepth;
    }
}
