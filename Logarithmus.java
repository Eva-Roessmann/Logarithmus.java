/*
Titel :  Schleifen und Verzweigungen (Mathematik)
Autor : Rößmann Eva 19.05.2026
 */

public class Logarithmus {

    public static void main(String[] args) {

        for (int i = 80; i >= 1; i--) {

            double log = Math.log10(i);

            int sterne = (int)(log * 10);

            System.out.print(i + " ");

            for (int j = 0; j < sterne; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
