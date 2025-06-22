import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        // Information message
        System.out.println("\n--Required Final Grade Calculator--\n");

        // Variable midterm out of the do-while to make it work in both do and while
        double midterm;


        do {

            System.out.print("Enter your midterm grade: "); // Midterm input
            midterm = scanner.nextDouble();
            System.out.println("");

            if (midterm < 0 || midterm > 100){ // Midterm validation conditional

                System.out.println("Enter a valid grade...\n");
            }

        }while (midterm < 0 || midterm > 100);

        // Formula based on 40% midterm and 60% final impact
        double referance = (200 - (2*midterm)) / 3;

        // Output message
        System.out.println("Your final grade must be at least " + referance + " to pass the lesson.");


    }
}