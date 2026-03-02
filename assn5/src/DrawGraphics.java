import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
    ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        //ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();要放在构造器外面
        box = new BouncingBox(200, 50, Color.RED);
        BouncingBox box2 = new BouncingBox(200, 50, Color.GREEN);
        box2.setMovementVector(1,-1);
        BouncingBox box3 = new BouncingBox(200, 50, Color.YELLOW);
        box3.setMovementVector(-1,1);
        BouncingBox box4 = new BouncingBox(200, 50, Color.BLUE);
        box4.setMovementVector(-1,-1);
        boxes.add(box2);
        boxes.add(box3);
        boxes.add(box4);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawLine(50, 250, 250, 50);
        surface.drawOval(50, 50, 200, 200);
        surface.drawRect(50, 50, 200, 200);
        surface.drawArc(50, 50, 200, 200, 0, 360);
        box.draw(surface);
        for (BouncingBox b : boxes) {
            b.draw(surface);
        }
    }
} 