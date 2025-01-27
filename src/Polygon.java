import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;

public class Polygon {
    public String name;
    public Point centerPoint;

    public Polygon(String str, Point p) {
        name = str;
        centerPoint = p;

    }
    public void paint(Graphics g) {
        Point currentCenter = this.centerPoint;
        if (this.name.equals("square")) {
            this.paintSquare(g,currentCenter); }
        else if (this.name.equals("triangle")) {
            this.paintTriangle(g,currentCenter);}
        else if (this.name.equals("rectangle"));
            this.paintRectangle(g,currentCenter);
            }

    private void paintSquare(Graphics g, Point currentCenter) {
        g.drawRect(currentCenter.x -10, currentCenter.y -10, 20, 20);
    }
    private void paintTriangle(Graphics g, Point currentCenter) {
        g.drawLine(currentCenter.x, currentCenter.y-10, currentCenter.x-10,
                currentCenter.y+10);
        g.drawLine(currentCenter.x-10, currentCenter.y+10,
                currentCenter.x+10, currentCenter.y+10);
        g.drawLine(currentCenter.x+10, currentCenter.y+10, currentCenter.x,
                currentCenter.y-10);
    }
    private void paintRectangle(Graphics g, Point currentCenter) {

        g.drawRect(currentCenter.x -20, currentCenter.y -10, 40, 20);
    }

    /*

    TODO: For each step below, named STEP 1..5, do the following:
      a) Draw a UML Class Diagram that describes the codebase statically after (all substeps of)
         the proposed refactoring step.
      b) Draw a UML Object Diagram that describes the system dynamically, after (all substeps of)
         the proposed refactoring step, at a relevant point during execution.
      c) assert: You should not have touched the code before reaching this point.
         Don't proceed unless you've drawn the diagrams.
      d) When, and only when, you've drawn the diagrams: Refactor the code as specified.

      STEP 0: * The system as it looks right now, before any refactoring steps (and without this
                Polygon file).
      STEP 1: * Create a new class Polygon (this file) to hold the variables name and centerPoint
                together. Implement a constructor Polygon(String,Point).
              * Create instances of this class appropriately in the DrawPolygons class.
      STEP 2: * Add a paint method to Polygon. Move all relevant functionality from DrawPolygons.paint.
      STEP 3: * Simplify the if statement in Polygon.paint through functional decomposition into
                three separate methods: paintSquare, paintTriangle, paintRectangle
      STEP 4: * Create three subclasses of Polygon, named Square, Triangle, and Rectangle.
              * Remove all aspects of 'name', polygons should be classified by which
                subclass they belong to.
              * Give each subclass the correct paint method. Simplify the paint methods
                in DrawPolygons and Polygon.
      STEP 5: * Make the Polygon class abstract.
              * Make the constructor Polygon(Point) private.
              * Create a public constructor Polygon(int,int) that internally calls the now-private
                Polygon(Point)
              * Simplify DrawPolygons by calling the new Polygon(int,int) constructor instead.

     */

}
