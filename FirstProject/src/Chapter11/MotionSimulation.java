// import java.util.Scanner;

// public class MotionSimulation {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Get the initial position and velocity of the object.
//         System.out.println("Enter the initial position of the object (x, y): ");
//         double x0 = scanner.nextDouble();
//         double y0 = scanner.nextDouble();

//         System.out.println("Enter the initial velocity of the object (vx, vy): ");
//         double vx0 = scanner.nextDouble();
//         double vy0 = scanner.nextDouble();

//         // Create a vector to represent the object's position.
//         Vector position = new Vector(x0, y0);

//         // Create a vector to represent the object's velocity.
//         Vector velocity = new Vector(vx0, vy0);

//         // Simulate the motion of the object for a certain number of time steps.
//         int numTimeSteps = 100;
//         for (int i = 0; i < numTimeSteps; i++) {

//             // Update the object's position.
//             position.add(velocity);

//             // Calculate the object's acceleration due to gravity.
//             Vector acceleration = new Vector(0, -9.81);

//             // Update the object's velocity.
//             velocity.add(acceleration);
//         }

//         // Print the object's final position.
//         System.out.println("The final position of the object is: " + position);
//     }
// }