import java.util.Scanner;

public class AverageOfNumbersDivisibleByThreeAndFour {
    public static void main(String[] args) {
        int number, total = 0, counter = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 0; i<=number; i++) {
            if ((i%3 == 0) && (i%4 == 0) && (i != 0)) {
                total += i;
                counter ++;
            }
        }
        double avg = (total / counter);
        System.out.println("The average of the numbers from zero to the number you entered are divisible by 3 and 4: " + avg);
    }
}
