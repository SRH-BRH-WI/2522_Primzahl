public class Primzahl {
    public static void main(String[] args) {
        int zahl = 1739;

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
