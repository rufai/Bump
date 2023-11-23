public class Bar {

    public static void main(String[] args) {
        int[] score = {0,2,4,6,0,0,0,1,2,3};

        System.out.println("Grade distribution");

        for( int counter = 0; counter < score.length; counter++ ){

            System.out.printf( "%03d -%03d", counter * 10, counter * 10 + 9 );

            for( int stars = 0; stars < score[ counter ]; stars++ ){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
