import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.*;
import java.util.ArrayList;

public class Board extends JPanel implements ActionListener, KeyListener {

    private final int DELAY = 25;
    public static final int TILE_SIZE = 25;
    public static final int ROWS = 12;
    public static final int COLUMNS = 18;
    public static final int NUM_COINS = 5;
    private static final long serialVersionUID = 490905409104883233L;
    private Player player;
    private ArrayList<Potion> potions;
    private Timer timer;

    public Board() {
        setPreferredSize(new Dimension(COLUMNS * TILE_SIZE, ROWS * TILE_SIZE));
        setBackground(Color.BLACK);

        player = new Player();
        potions = populatePotions();

        timer = new Timer(DELAY, this);
        timer.start();
    }

    private void collectPotions() {
        ArrayList<Potion> potionsCollected = new ArrayList<>();
        for (Potion potion : potions) {
            if (potion.getPosition().equals(player.getPosition())) {
                potionsCollected.add(potion);
                player.addScore(1);
            }
        }
    }
}
