import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class Player {
    private BufferedImage image;
    private Point position;
    private int counter;

    public Player() {
        loadImage();
        position = new Point(0, 0);
        counter = 0;
    }

    public void loadImage() {
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/player.png"));
        } catch (Exception e) {
            System.out.println("Error loading player image");
        }
    }

    public void render(Graphics g, ImageObserver observer) {
        g.drawImage(image,
                (position.x * Board.TILE_SIZE),
                (position.y * Board.TILE_SIZE),
                observer);
    }

    public void KeyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP) {
            position.y--;
        } else if (e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN) {
            position.y++;
        } else if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT) {
            position.x--;
        } else if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT) {
            position.x++;
        }
    }

    public void tick() {
        if (position.x < 0) {
            position.x = 0;
        } else if (position.x >= Board.COLUMNS - 1) {
            position.x = Board.COLUMNS - 1;
        } else if (position.y < 0) {
            position.y = 0;
        } else if (position.y >= Board.ROWS - 1) {
            position.y = Board.ROWS - 1;
        }
    }

    public String getScore() {
        return String.valueOf(counter);
    }

    public void addScore(int nbr) {
        counter = counter + nbr;
    }

    public Point getPosition() {
        return position;
    }
}
