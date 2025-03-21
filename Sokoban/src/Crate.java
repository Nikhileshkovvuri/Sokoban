import javax.swing.ImageIcon;
import java.awt.Image;

/**
 * This class is used for defining and initializing variable for the crates
 */

public class Crate
{
	/**
	 * creating variables for 4 crates
	 */
    private int Box1tileX;
    private int Box1tileY;
    private Image Box1;

    private int Box2tileX;
    private int Box2tileY;
    private Image Box2;

    private int Box3tileX;
    private int Box3tileY;
    private Image Box3;

    private int Box4tileX;
    private int Box4tileY;
    private Image Box4;
    

	/**
	 * Constructor for the Crates that will be set on the specified
	 * board. The player will automatically start at the top left 
	 * of the board
	 * @param board The board the player will play on.
	 */
    public Crate() {
        Box1();
        Box2();
        Box3();
        Box4();
    }
    
    /**
     * Providing image icon and coordinates for the  crate 1
     * tilex indicates x axis in the map
     * tiley indicates y axis in the map
     */
    public void Box1() {
        final ImageIcon img = new ImageIcon("img//Box.png");
        this.Box1 = img.getImage();
        this.Box1tileX = 8;
        this.Box1tileY = 14;
    }
    
    public Image getBox1() {   

        return this.Box1;
    }
    
    public int getBox1TileX() {
        return this.Box1tileX;
    }
    
    public int getBox1TileY() {
        return this.Box1tileY;
    }
    
    public void moveBox1(final int dx, final int dy) {
        this.Box1tileX += dx;
        this.Box1tileY += dy;
    }
    /**
     * Providing image icon and coordinates for the  crate 2
     * tilex indicates x axis in the map
     * tiley indicates y axis in the map
     */

    public void Box2() {
        final ImageIcon img = new ImageIcon("img//Box.png");
        this.Box2 = img.getImage();
        this.Box2tileX = 7;
        this.Box2tileY = 9;
    }
    
    public Image getBox2() {    	
        return this.Box2;
    }
    
    public int getBox2TileX() {
        return this.Box2tileX;
    }
    
    public int getBox2TileY() {
        return this.Box2tileY;
    }
    
    public void moveBox2(final int dx, final int dy) {
        this.Box2tileX += dx;
        this.Box2tileY += dy;
    }
    
    /**
     * Providing image icon and coordinates for the  crates 3
     * tilex indicates x axis in the map
     * tiley indicates y axis in the map
     */

    public void Box3() {
        final ImageIcon img = new ImageIcon("img//Box.png");
        this.Box3 = img.getImage();
        this.Box3tileX = 10;
        this.Box3tileY = 8;
    }
    
    public Image getBox3() {    	
        return this.Box3;
    }
    
    public int getBox3TileX() {
        return this.Box3tileX;
    }
    
    public int getBox3TileY() {
        return this.Box3tileY;
    }
    
    public void moveBox3(final int dx, final int dy) {
        this.Box3tileX += dx;
        this.Box3tileY += dy;
    }
    
    /**
     * Providing image icon and coordinates for the  crates 4
     * tilex indicates x axis in the map
     * tiley indicates y axis in the map
     */
    public void Box4() {
        final ImageIcon img = new ImageIcon("img//Box.png");
        this.Box4 = img.getImage();
        this.Box4tileX = 14;
        this.Box4tileY = 8;
    }
    
    public Image getBox4() {    	
        return this.Box4;
    }
    
    public int getBox4TileX() {
        return this.Box4tileX;
    }
    
    public int getBox4TileY() {
        return this.Box4tileY;
    }
    
    public void moveBox4(final int dx, final int dy) {
        this.Box4tileX += dx;
        this.Box4tileY += dy;
    }
}
