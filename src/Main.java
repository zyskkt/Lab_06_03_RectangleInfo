import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Init variables
        Scanner in = new Scanner(System.in);
        double rectLeft = 0;
        double rectTop = 0;
        double rectArea;
        double rectPerimeter;
        double rectDiagonal;
        String trash = "";
        //Prompt for input
        System.out.println("Enter the length of the left side of the rectangle:");
        //If statement to check for valid entry and if none return error
        if (in.hasNextDouble()) {
            rectLeft = in.nextDouble(); // set variable from input
            in.nextLine(); // Clear buffer
        } else {
            trash = in.nextLine();
            System.out.println("Your entry, " + trash + " is not valid. Restart program and enter a number."); // Let user know the error.
            System.exit(0); // Close program.
        }
        System.out.println("Enter the length of the top side of the rectangle:");
        //If statement to check for valid entry and if none return error
        if (in.hasNextDouble()) {
            rectTop = in.nextDouble(); // set variable from input
            in.nextLine(); // Clear buffer
        } else {
            trash = in.nextLine();
            System.out.println("Your entry, " + trash + ", is not valid. Restart program and enter a number."); // Let user know the error.
            System.exit(0); // Close program.
        }
        //Calculate area
        rectArea = rectLeft * rectTop;
        //Calculate perimeter
        rectPerimeter = (rectLeft * 2) + (rectTop * 2);
        //Calculate diagonal
        rectDiagonal = Math.sqrt(Math.pow(rectLeft, 2) + Math.pow(rectTop, 2));

        //Print results
        System.out.println("Area: " + rectArea);
        System.out.println("Perimeter: " + rectPerimeter);
        System.out.println("Diagonal: "+ rectDiagonal);
    }
}