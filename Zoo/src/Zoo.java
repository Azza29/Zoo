public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25]; 
    }

   
    public void displayZoo() {
        System.out.println("Zoo name: " + this.name);
        System.out.println("City: " + this.city);
        System.out.println("Number of cages: " + this.nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo name: " + this.name + ", City: " + this.city + ", Number of cages: " + this.nbrCages;
    }
}
