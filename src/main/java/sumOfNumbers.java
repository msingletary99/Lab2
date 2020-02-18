import java.util.Scanner;
public class sumOfNumbers {
    public static void main(String[] args) {
        System.out.println("Please insert a positive number.");
            Scanner keyboard= new Scanner(System.in);
            int number = keyboard.nextInt();
            int sum = 0;
            
            for( int i=1; i<=number; i++){
                sum=sum+i;
            }
            
            System.out.println("Sum from 1 to " + number + " is " + sum);
            
            
            
            
    }
    
}
