import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


				int secondsPassed = (hours2 - hours1) * 3600 + (minutes2 - minutes1) * 60 + (seconds2 - seconds1);
				System.out.println(secondsPassed);
        // closing the scanner object
        scanner.close();
    }
}