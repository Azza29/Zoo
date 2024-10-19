import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();
        System.out.print("Entrez le nombre de cages : ");
        int nbrCages = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Entrez la ville du zoo : ");
        String zooCity = scanner.nextLine();
        Zoo myZoo = new Zoo(zooName, zooCity, nbrCages);
        System.out.print("Entrez le nom de l'animal : ");
        String animalName = scanner.nextLine();
        System.out.print("Entrez la famille de l'animal : ");
        String animalFamily = scanner.nextLine();
        System.out.print("Entrez l'âge de l'animal : ");
        int animalAge = scanner.nextInt();
        System.out.print("L'animal est-il un mammifère (true/false) ? ");
        boolean isMammal = scanner.nextBoolean();
        Animal lion = new Animal(animalFamily, animalName, animalAge, isMammal);
        System.out.println("\nInformations du Zoo :");
        myZoo.displayZoo();
        System.out.println(myZoo);

        System.out.println("\nInformations de l'Animal :");
        System.out.println(lion);
    }
}
