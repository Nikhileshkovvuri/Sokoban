import javax.swing.ImageIcon;
import java.awt.Image;

/**
 * A class that creates all the elements necessary for a player
 * to traverse the Sokoban.
 */

public class Warehouse_Keeper
{
    private int tileX;
    private int tileY;
    private Image player;
    

	/**
	 * Constructor for the player that will be set on the specified
	 * board. The player will automatically start at the top left 
	 * of the board
	 * @param board The board the player will play on.
	 */
    public Warehouse_Keeper() {
        final ImageIcon img = new ImageIcon("C:\\\\Users\\\\Reaper\\\\eclipse-workspace\\\\Sokoban\\\\img\\\\Gamer.png");
        this.player = img.getImage();
        this.tileX = 8;
        this.tileY = 8;
    }
    
    public Image getPlayer() {
        return this.player;
    }
    
    public int getTileX() {
        return this.tileX;
    }
    
    public int getTileY() {
        return this.tileY;
    }
    
    public void move(final int dx, final int dy) {
        this.tileX += dx;
        this.tileY += dy;
        
    }
}
