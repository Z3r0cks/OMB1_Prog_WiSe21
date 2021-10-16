import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        int numberVar = 3;
        char onlyOneLetter = 't';
        String multipleLetters = "Test";

        int calc = 44 * 55 + 777;
        boolean biggerThan3000 = calc>3000;
        boolean dividableWithThree = calc%3 == 0;

        double secondCalc = 10/(-1.7);
        int castCalc = ((int) secondCalc);
        // Ermitteln Sie in einem Ausdruck, ob das Ergebnis zwischen -5 und -10 liegt, aber
        // ungleich -7 ist. (Ausgabe: „true“ oder „false“)

        boolean isInSpecificValue = castCalc < -5 && castCalc > -10;

        // Setzen Sie die folgende Eingabe um:
        // Lassen Sie einen Buchstaben eingeben (a-z bzw. A-Z).

         Scanner input = new Scanner(System.in);
         char letter = input.next().charAt(0);

        // Geben Sie einen Fehler aus, wenn es sich bei der Eingabe nicht um einen Buchstaben
        //handelt.
        boolean isLetter = false;

        // durch das casten wird es ein ACSII-Code

        // A-Z
        if((int)letter >= 65 && (int)letter <= 90) {
            isLetter = true;

            // a-z
        } else if ((int)letter >= 97 && (int)letter <= 122) {
            isLetter = true;
        }
    }
}
