import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int inch = 100;

        double cm_per_inch = 2.54;
        double cm = inch * cm_per_inch;
        //double cm = inch * 2.54;

        System.out.printf("%d in = %f cm\n", inch, cm);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Scanner for temp. calculation");
        System.out.println("Enter celsius temp.");

        double celcius =scanner.nextInt();
        double fahrenheit = ((celcius * 9)/5) + 32;

        System.out.printf("%.2f in celsius = %.2f f\n",celcius, fahrenheit);

        System.out.println("Now, time to calculate time...");

        int time = scanner.nextInt();

        int hours = time /3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;

        //Other methods can be used, fx final int
        //Learn that!

        System.out.printf("%d in hour, %d minutes, %d seconds\n", hours, minutes, seconds);

        System.out.println("Time for guessing a number.\n[type 1-100]");

        Random random = new Random();

        int guess1 = scanner.nextInt();
        int number = random.nextInt(100) + 1;

        int offamount = number - guess1;

        System.out.println("Your guess was: " + guess1);
        System.out.println("I was thinking of: " + number);
        System.out.println("You were " + offamount + " off.");
    }
}
