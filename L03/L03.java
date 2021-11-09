public class L03 {
    public static void main(String[] args) {
        System.out.println(abgabeRecMain('b'));
    }

    public static int abgabeRecMain(char letter) {
        int fv = abgabeRecP(letter, 0);
        int sv = abgabeRecM(letter, 0);
        return Math.min(fv, sv);
    }

    public static int abgabeRecP(char letter, int count) {
        int result = 0;
        if (!checkLetter(letter)) {
            result = abgabeRecP((char) ((int) (letter) + 1), count + 1);
        } else result = count;
        System.out.println("plus: " + result);
        return result;
    }

    public static int abgabeRecM(char letter, int count) {
        int result = 0;
        if (!checkLetter(letter)) {
            result = abgabeRecP((char) ((int) (letter) - 1), count - 1);
        } else result = count;
        System.out.println("minus: " + result);
        return result;
    }

    public static boolean checkLetter(char letter) {
        return letter == 97 || letter == 101 || letter == 105 || letter == 111 || letter == 117;
    }

    public static void recuseNumbers(int number, int control, boolean check) {
        System.out.print(number + " ");
        if (check && number != 0)
            recuseNumbers(number - 1, control, true);
        else if (check)
            recuseNumbers(number + 1, control, false);
        else if (number != control)
            recuseNumbers(number + 1, control, false);
    }

    public static void recuseInterest(double save, int lifetime, double interest) {
        if (lifetime == 0) System.out.println(save);
        else {
            save = save + ((save / 100) * interest);
            recuseInterest(save, lifetime - 1, interest);
        }
    }

    public static boolean istGleich(int number1, int number2) {
        return number1 == number2;
    }

    public static boolean istGleich(double double1, double double2) {
        return double1 == double2;
    }

    public static boolean istGleich(int number1, int number2, int number3) {
        if (number1 == number2)
            return number2 == number3;
        else return false;
    }

    public static double interestCalc(double capital, double interest) {
        return capital + (capital / 100) * interest;
    }

    public static int sumNumbers(int startNumber, int endNumber) {
        for (int i = startNumber + 1; i <= endNumber; i++) {
            startNumber = startNumber + i;
        }
        return startNumber;
    }
}