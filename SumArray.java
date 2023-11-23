public class SumArray {

    public static void main(String[] args) {
        int[] array = {87, 68, 94,100, 83, 78,85,91, 76, 33};

        int total = 0;

        for ( int counter = 0;  counter < array.length; counter++ ){
            total += array[counter];
        }

        System.out.println( "The total of array is : " + total );
    }
}
