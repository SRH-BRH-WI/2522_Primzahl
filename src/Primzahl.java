import java.util.Scanner;

public class Primzahl {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        System.out.print("Bitte zu prüfende Zahl eingeben: ");
        int zahl = eingabe.nextInt();

        for (int teiler = 2; teiler < zahl; teiler++) {
            if (zahl % teiler == 0) {
                System.out.println("Teiler gefunden: " + teiler);
                System.out.println("KEINE Primzahl!");
                System.exit(0);
            }
        }

        System.out.println(zahl + " ist eine Primzahl!!!");
    }
}
