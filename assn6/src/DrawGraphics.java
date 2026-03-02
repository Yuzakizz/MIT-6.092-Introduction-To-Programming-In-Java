import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
   private ArrayList<Mover> movers = new ArrayList<Mover>();

    /**
     * Initializes this class for drawing.
     */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        Ellipse box1 = new Ellipse(15, 50, Color.BLACK);
        movers.add(new Bouncer(100, 170, box));
        movers.add(new Bouncer(100, 170, box1));
        movers.get(0).setMovementVector(3, 1);
        movers.get(1).setMovementVector(1, 3);

        movers.add(new StraightMover(10, 60, box));
        movers.add(new StraightMover(50, 40, box1));
        movers.get(2).setMovementVector(2, -13);
        movers.get(3).setMovementVector(4, 3);
    }

    /**
     * Draw the contents of the window on surface.
     */
    public void draw(Graphics surface) {
        for (Mover mover : movers) {
            mover.draw(surface);
        }
    }
}
