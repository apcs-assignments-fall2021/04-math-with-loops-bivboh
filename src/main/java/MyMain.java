import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; ++i) {
            factorial = factorial * i;
        }
        return factorial;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e_comp = 0;
        int e_test = 1;
        double e_value = Math.E;
        while (e_value - e_comp >= 0.00000000001){
            e_comp = (1/factorial(e_test));
            e_test++;
        }
        return (Math.E);
    }

    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = x;
        double a = 1;
        double accuracy = 0.00001;
        while (n-a > accuracy) {
            n = (n + a) / 2;
            a = x/n;
        }
        return n;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a number");
        int x = scan.nextInt();
        System.out.println("The factorial of your number is: " + factorial(x));

        // YOUR CODE HERE


        

        scan.close();
    }
}
