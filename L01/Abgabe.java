import java.util.Scanner;

public class Abgabe {

    public static void main(String[] args) {
        double costPerNight = 89.5;
        double flat = 29.1;
        int discountPercent = 7;

        Scanner scanner = new Scanner(System.in);
        int nights = scanner.nextInt();

        double costForNights = costPerNight*nights;
        double discount = nights>1 ? Math.round(((costForNights/100)*discountPercent) * 100): 0;
        double discountRound = discount / 100;

        double summary = costForNights - discountRound + flat;

       System.out.println(summary);
    }
}