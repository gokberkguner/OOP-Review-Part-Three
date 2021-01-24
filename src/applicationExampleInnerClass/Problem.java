package applicationExampleInnerClass;

public class Problem {

    public static class Math {

        public static void CircleArea(int radius){
            System.out.println("Circle Area: " + (3.14 * radius * radius));
        }

        public static void TriangleEnvironment(int edge1, int edge2, int edge3) {
            System.out.println("Triangle Environment: " + (edge1 + edge2 + edge3));
        }

    }


    public static class Physics {

        public static void dotProduct(Vector vectorA, Vector vectorB) {

            int dot_product  = vectorA.getI() * vectorB.getI() + vectorA.getJ() * vectorB.getJ() + vectorA.getK() * vectorB.getK();
            System.out.println(vectorA.getName() + " ile " + vectorB.getName() + "'s dot product result is " + dot_product);

        }

    }

}
