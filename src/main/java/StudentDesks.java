import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {
        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int g1 = scanner.nextInt();
				int g2 = scanner.nextInt();
				int g3 = scanner.nextInt();

        int totalDesks = (g1 / 2) + (g2 / 2) + (g3 / 2);
				if (g1 % 2 == 1)
					totalDesks++;
				if (g2 % 2 == 1)
					totalDesks++;
				if (g3 % 2 == 1)
					totalDesks++;

				System.out.print(totalDesks);


        // closing the scanner object
        scanner.close();
    }
}