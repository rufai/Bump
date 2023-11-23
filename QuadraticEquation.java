import java.util.Scanner;

public class QuadraticEquation {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        guess_a_number();
//        System.out.println(  addition(6,7) );

//        user_input();

        // a  = 4, b = -5, c = -12
//        System.out.println( roots(4,-5,-12)[1] );

        // a  = 1, b = -5, c = 6
//        System.out.println( roots(1,-5,-6)[0] );
//        System.out.println( roots(1,-5,-6)[1] );
        // a  = 3, b = -5, c = 2
//        System.out.println( roots(3,-5,2)[0] );
//        System.out.println( roots(3,-5,2)[1] );
    }

    public static int addition(int a, int b){
        return a + b;
    }

    public static double[] roots(double a, double b, double c){
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        double root_discriminant = Math.sqrt(discriminant);

        double positive_root = (-b + root_discriminant) / ( 2* a ) ;
        double negative_root = (-b - root_discriminant) / ( 2* a ) ;

        double[] roots  = new double[2];

        roots[0]  = positive_root;
        roots[1] = negative_root;

        return roots;

    }

    // random simple change

    public static int user_input(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int upper_bound =  input.nextInt();

        System.out.println( Math.pow( upper_bound, 2 ) );

        for (int i  = 0; i < 10; i++){
            System.out.println( (int) (Math.random() * (upper_bound )) + 1  );
        }

        return upper_bound;
    }

    public static boolean guess_a_number(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int guess =  input.nextInt();


        int predicted_number = (int) (Math.random() * (20000)) + 1;

//        System.out.println("Your number is " + guess + "./n The predicted number is: " + predicted_number );

        while( guess != predicted_number) {
            System.out.println("Your guess is wrong. Try again");


            if ( guess > predicted_number){
                System.out.println("Your guess is greater than the predicted number");
            }
            else {
                System.out.println("Your guess is less than the predicted number");
            }

            guess =  input.nextInt();


        }

        if( guess == predicted_number) {
            System.out.println("Hurray!!!");
            return true;
        }

        return false;

//        int our_number  = Math.random()

    }
}