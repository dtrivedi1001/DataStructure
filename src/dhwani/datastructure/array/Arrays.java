package dhwani.datastructure.array;

/**
 * Created by dhwani on 4/26/17.
 *
 * Sample program finds a minimal value among entered.
 * Note that Java allows only dynamically allocated arrays.
 */
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // dynamically allocated array
        int arr[] = new int[15];
        int n = 0;
        int value = 0;
        System.out.println("Enter values. Type \"-1\" to stop: ");
        while (n < 15 && value != -1) {
            value = keyboard.nextInt();
            keyboard.nextLine();
            if (value != -1) {
                arr[n] = value;
                n++;
            }
        }
        if (n == 0) {
            System.out.println("You have entered no values, bye!");
        } else {
            int minimum = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] < minimum)
                    minimum = arr[i];
            }
            System.out.print("The minimal value is " + minimum);
        }
    }
}