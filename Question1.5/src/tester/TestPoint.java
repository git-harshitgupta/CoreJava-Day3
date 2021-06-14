package tester;
import com.geometry.Point2D;

import java.util.Scanner;

class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates from the first point");
        Point2D p1 = new Point2D(scanner.nextInt(),scanner.nextInt());
        System.out.println("Enter the coordinates from second point");
        Point2D p2 = new Point2D(scanner.nextInt(),scanner.nextInt());
        System.out.println("Coordinates of the first point is "+p1.getDetails());       
        System.out.println("Coordinates of the second point is "+p2.getDetails());
        System.out.println(p1.isEqual(p2)?"Equal":"Different");
        System.out.println("Enter the coordinates from the point 3");
        Point2D p3 = p1.createNewPoint(scanner.nextInt(),scanner.nextInt());
        System.out.println(p3.getDetails());
        p1.calculateDistance(p2);



    }    
}
