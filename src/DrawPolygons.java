import javax.swing.*;
import java.awt.*;
import java.util.*;

public class DrawPolygons extends Component{
    private ArrayList<Polygon> polygons;

    public DrawPolygons(){
        polygons = new ArrayList<>();

        Polygon p1 = new Polygon("square",new Point(100,100));
        Polygon p2 = new Polygon("triangle",new Point(150,150));
        Polygon p3 = new Polygon("rectangle",new Point(100,200));

        polygons.add(p1);
        polygons.add(p2);
        polygons.add(p3);
    }//constructor

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < polygons.size(); i++) {
            Polygon currentPolygon = polygons.get(i);
            if (currentPolygon.equals("square"))
                g.drawRect(currentPolygon.centerPoint.x -10, currentPolygon.centerPoint.y -10, 20, 20);
            else if (currentPolygon.equals("triangle")) {
                g.drawLine(currentPolygon.centerPoint.x, currentPolygon.centerPoint.y-10, currentPolygon.centerPoint.x-10,
                        currentPolygon.centerPoint.y+10);
                g.drawLine(currentPolygon.centerPoint.x-10, currentPolygon.centerPoint.y+10,
                        currentPolygon.centerPoint.x+10, currentPolygon.centerPoint.y+10);
                g.drawLine(currentPolygon.centerPoint.x+10, currentPolygon.centerPoint.y+10, currentPolygon.centerPoint.x,
                        currentPolygon.centerPoint.y-10);
            } else if (currentPolygon.equals("rectangle"))
                g.drawRect(currentPolygon.centerPoint.x -20, currentPolygon.centerPoint.y -10, 40, 20);
        }
    }//paint

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);
    }//main
}//DrawPolygons