public class VolumeOfCylinder{
    public static void main(String[] args) {

        double answer = calculate(4,8);
        System.out.println(answer);
    }
    public static double calculate(double radius, double height){
        return Math.PI * Math.pow(radius,2) * height;
    }
}