import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class Potion {

    private BufferedImage image;
    private Point position;

    public Potion() {
        loadImage();
        position = new Point(0, 0);
    }

    private void loadImage() {
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/potion.png"));
        } catch (Exception e) {
            System.out.println("Error loading potion image");
        }
    }

    public void render(Graphics g, ImageObserver observer) {
        g.drawImage(image,
                (position.x * Board.TILE_SIZE),
                (position.y * Board.TILE_SIZE),
                observer);
    }

    public Point getPosition() {
        return position;
    }
}
