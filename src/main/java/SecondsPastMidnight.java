import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int inp = scanner.nextInt();

				int hours = inp / 3600;
				int minutes = inp / 60;

				System.out.print(hours + " " + minutes);

        // closing the scanner object
        scanner.close();
    }
}