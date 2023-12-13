import java.util.Scanner;

class Pi{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the radius from the user
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculate the area of the circle
        double area = Math.PI * radius * radius;

        // Print the area of the circle
        System.out.println("The area of the circle is: " + area);
    }
}