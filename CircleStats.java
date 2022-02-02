import java.util.Scanner;
/**
 * 
 *
 * @author Karrame Campbell
 * @version 16
 */
public class CircleStats {
    // radius of the circle
    private double radius;
    
    /**
     * main method asks a circle size and uses CircleStats
     * to calculate information for display.
     */
    public static void main(String[] args) {
        double inputRadius;
        Scanner keyInput = new Scanner(System.in);
        
        System.out.print("Enter the radius for your circle: ");
        inputRadius = keyInput.nextDouble();
        CircleStats c = new CircleStats(inputRadius);
        System.out.println(c.toString());
    }

    /**
     * Constructor for objects of class CircleStats
     * 
     * @param r the radius of a circle
     */
    public CircleStats(double r) {
        // initialize radius
        radius = r;
    }

    /**
     * toString calculates the circle's stats and 
     * returns them in a string ready for printing.
     * 
     * @return the information for the circle
     */
    public String toString() {
        return "The circle's radius is " + radius + "\n" +
               "The circle's circumference is " + (2.0 * Math.PI * radius) + "\n" +
               "The circle's area is " + (Math.PI * radius * radius) + "\n" +
               "The surface area of a sphere with the same radius is " + (4.0 * Math.PI * radius * radius) + "\n";
    }
}
