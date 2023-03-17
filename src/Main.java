import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Läs in ett filnamn från användaren
        // Öppna filen och läs in X temperaturangivelser (en per rad)
        // Skriv ut den högsta temperaturen och medeltemperaturen

        Scanner input = new Scanner(System.in);
        System.out.print("Ange ett filnamn: ");
        String filename = input.nextLine();

        Scanner fileIn = new Scanner(new File(filename));
        int count = 0;
        double max = 0;
        double total = 0;

        while (fileIn.hasNextDouble()) {
            double value = fileIn.nextDouble();
            max = Math.max(value, max);
            total += value;
            count++;
        }

        System.out.println("Högsta temperatur: " + max);
        System.out.println("Medeltemperatur: " + (total/count));
    }
}