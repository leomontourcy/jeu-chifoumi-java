import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int joueur = 0;
        int ordi = 0;

        while (joueur < 3 && ordi < 3) {
            System.out.println("1 = Pierre, 2 = Feuille, 3 = Ciseaux");
            System.out.print("Ton choix : ");
            int choix = sc.nextInt();

            int choixOrdi = rand.nextInt(3) + 1;

            System.out.println("L'ordinateur a choisi : " + choixOrdi);

            if (choix == choixOrdi) {
                System.out.println("Egalite, on rejoue la manche");
            } else if ((choix == 1 && choixOrdi == 3) ||
                       (choix == 2 && choixOrdi == 1) ||
                       (choix == 3 && choixOrdi == 2)) {
                System.out.println("Tu gagnes la manche");
                joueur++;
            } else {
                System.out.println("L'ordinateur gagne la manche");
                ordi++;
            }

            System.out.println("Score : toi = " + joueur + " | ordi = " + ordi);
            System.out.println();
        }

        if (joueur == 3) {
            System.out.println("Tu as gagne la partie !");
        } else {
            System.out.println("L'ordinateur a gagne la partie !");
        }

        sc.close();
    }
}