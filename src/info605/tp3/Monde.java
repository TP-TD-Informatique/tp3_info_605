package info605.tp3;

import java.util.Scanner;

public class Monde {

    public static void ecrire(Couleur coul, String s) {
        System.out.printf("\033[%d;1m%s\033[0m\n", coul.ordinal()+31, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Table tab = new Table();
        Robot D2R2 = new Robot(tab);
        char c = ' ';
        Couleur coul;
        TailleCube tc;
        do {
            System.out.println("1 - créer un cube");
            System.out.println("2 - détruire un cube");
            System.out.println("3 - prendre un cube");
            System.out.println("f - fin du monde");
            System.out.print("Votre choix : ");
            c = sc.next().charAt(0);
            switch (c) {
                case '1':
                    System.out.print("Couleur du cube : ");
                    coul = Couleur.getCouleur(sc.next());
//			ecrire (coul, "couleur saisie");
                    System.out.print("Taille (grand/moyen/petit) : ");
                    tc = TailleCube.getTaille(sc.next());
                    D2R2.creerCube(coul, tc);
                    break;
                case '2':
                    System.out.println("Le cube tenu par le robot va être détruit ");
                    D2R2.detruireCube();
                    break;
            }
            afficherMonde(D2R2, tab);
        } while (c != 'f');
    }

    private static void afficherMonde(Robot R, Table T) {
        ecrire(Couleur.noir, "Etat du monde : ");
        R.afficherRobot();
        T.afficherTable();

    }

}
