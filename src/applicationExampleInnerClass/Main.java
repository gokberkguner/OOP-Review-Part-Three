package applicationExampleInnerClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Program!");

        String calculations = "- Calculation -\n"
                            + "1. Circle Area Calculation\n"
                            + "2. Triangle Environment Calculation\n"
                            + "3. Dot Product Calculation\n"
                            + "Quit: q";

        while (true) {
            System.out.println(calculations);

            System.out.println("Choose the calculation. (1,2,3 or q)");
            String calculation = scanner.nextLine();

            if (calculation.equals("q")){
                System.out.println("Quit process.");
            }
            else if (calculation.equals("1")){
                System.out.println("Radius: ");
                int radius = scanner.nextInt();
                scanner.nextLine();

                Problem.Math.CircleArea(radius);
            }
            else if (calculation.equals("2")){
                System.out.println("Edge 1: ");
                int edge1 = scanner.nextInt();

                System.out.println("Edge 2: ");
                int edge2 = scanner.nextInt();

                System.out.println("Edge 3: ");
                int edge3 = scanner.nextInt();
                scanner.nextLine();

                Problem.Math.TriangleEnvironment(edge1,edge2,edge3);
            }
            else if (calculation.equals("3")){

                Vector vectorA = new Vector("Vector 1");
                Vector vectorB = new Vector("Vector 2");

                Problem.Physics.dotProduct(vectorA,vectorB);

            }
            else {
                System.out.println("Invalid Calculation!");
            }
        }

    }
}
