import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Ellipse implements Sprite {
    private final int width;
    private final int height;
    private final Color color;

    /**
     * 初始化椭圆的空间标量与光学属性
     */
    public Ellipse(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics surface, int leftX, int topY) {
        // 渲染实体内部色块
        surface.setColor(color);
        surface.fillOval(leftX, topY, width, height);

        // 渲染实体物理边界（描边）
        surface.setColor(Color.BLACK);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawOval(leftX, topY, width, height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}