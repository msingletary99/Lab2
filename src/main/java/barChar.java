
import java.util.Scanner;

public class barChar {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Today's Sales for Store 1:");
        int oneSales = keyboard.nextInt();

        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;

        System.out.print("Enter Today's Sales for Store 2:");
        int twoSales = keyboard.nextInt();

        System.out.print("Enter Today's Sales for Store 3:");
        int threeSales = keyboard.nextInt();

        System.out.print("Enter Today's Sales for Store 4:");
        int fourSales = keyboard.nextInt();

        System.out.print("Enter Today's Sales for Store 5:");
        int fiveSales = keyboard.nextInt();

        System.out.println("SALES BAR CHART");

        System.out.print("Store 1:");
        do {
            System.out.print("*");
            i += 100;
        } while (i < oneSales);

        System.out.print("\nStore 2:");
        do {
            System.out.print("*");
            j += 100;
        } while (j < twoSales);

        System.out.print("\nStore 3:");
        do {
            System.out.print("*");
            k += 100;
        } while (k < threeSales);

        System.out.print("\nStore 4:");
        do {
            System.out.print("*");
            l += 100;
        } while (l < fourSales);

        System.out.print("\nStore 5:");
        do {
            System.out.print("*");
            m += 100;
        } while (m < fiveSales);

    }

}
