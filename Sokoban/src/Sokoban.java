import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.*;
/**
 * Runs the Sokoban game.
 */
public class Sokoban extends Start_The_game
{
    public Sokoban(final int lvl,final String playername) {
        final JFrame f = new JFrame();
        f.setTitle("Sokoban");
        f.add(new Board(lvl,playername));
        f.setSize(650, 600);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setResizable(false);
    }
}