import java.awt.*;

public interface Mover {
    void draw(Graphics graphics);
    void setMovementVector(int xIncrement, int yIncrement);
}
