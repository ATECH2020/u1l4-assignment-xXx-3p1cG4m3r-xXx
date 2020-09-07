import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int theta = scanner.nextInt();

				int minuteHandTurned = (theta % 30) * 12;
				System.out.println(minuteHandTurned);

        // closing the scanner object
        scanner.close();
    }
}