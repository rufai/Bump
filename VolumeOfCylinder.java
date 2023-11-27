public class VolumeOfCylinder{
    public static void main(String[] args) {

        double answer = calculate(4,8);

    }

    public static void format(double r, double  h, double a){
        System.out.printf("The volume of a cylinder with radius: %2f and height: %2f is %f", r, h, a  );
    }

    public static double calculate(double radius, double height){

        double answer =  Math.PI * Math.pow(radius,2) * height;
        format(radius, height, answer);
        return answer;
    }
}