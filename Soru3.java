import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter edge a: ");
        int a = scanner.nextInt();
        System.out.print("Enter edge b: ");
        int b = scanner.nextInt();
        System.out.print("Enter edge c: ");
        int c = scanner.nextInt();

        int edgeAB, edgeBC, edgeAC;

        if( a < b ) edgeAB = b - a ;
        else edgeAB = a -b ;

        if( a < c ) edgeAC = c - a ;
        else edgeAC = a - c ;

        if( c < b ) edgeBC = b - c ;
        else edgeBC = c - b ;

        if ( (edgeAB < c && c < a + b) || (edgeAC < b && b < a + c) || (edgeBC < a && a < c + b)) {
            int halfOfThePerimeter = (a + b + c) / 2;
            int s1,s2,s3;

            if(halfOfThePerimeter < a) s1 = a - halfOfThePerimeter;
            else s1 = halfOfThePerimeter - a;

            if(halfOfThePerimeter < b) s2 = b - halfOfThePerimeter;
            else s2 = halfOfThePerimeter - b;

            if(halfOfThePerimeter < c) s3 = a - halfOfThePerimeter;
            else s3 = halfOfThePerimeter - c;

            double area = halfOfThePerimeter * s1 * s2 * s3;

            double result;
            double squareRoot = area / 2;

            do {
                result = squareRoot;
                squareRoot = (result + (area / result)) / 2;
            } while ((result - squareRoot) != 0);

            System.out.println("Number of flowers: " + (int)(squareRoot * 13));
        } else {
            System.out.println("Lengths of edges are not feasible!");
        }

    }
}
