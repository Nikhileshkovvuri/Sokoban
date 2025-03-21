import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.ImageObserver;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.*; 
 
public class Board extends JPanel implements ActionListener
{

/**
 * A board class that generates a full game board represented by
 * a 2D array of characters.
 */
    private Timer timer;
    private boolean win;
    
    public int Totalmoves=0;
    private int []  crates;
    private Map m;
    private Warehouse_Keeper p;
	private Crate b;
    public int level;
    public String PlayerName;
    
    public Board(final int lvl,final String playername) {
        this.win = false;
        this.m = new Map(lvl);
        level = lvl;
        PlayerName=playername;
        this.p = new Warehouse_Keeper();
        this.b = new Crate();
        this.addKeyListener(new Al());
        this.setFocusable(true);

        (this.timer = new Timer(10, this)).start();
    }
    

    /**
	 * The part of the code is used for action performing for validating the crates when they reach to diamond
	 */
    public void actionPerformed(final ActionEvent e) {
        if (this.m.getMap(this.b.getBox1TileX(), this.b.getBox1TileY()).equals("D") && 
        	this.m.getMap(this.b.getBox2TileX(), this.b.getBox2TileY()).equals("D") &&
        	this.m.getMap(this.b.getBox3TileX(), this.b.getBox3TileY()).equals("D") &&
        	this.m.getMap(this.b.getBox4TileX(), this.b.getBox4TileY()).equals("D")        	
        	) {
            	this.win = true;
            	JOptionPane.showMessageDialog(null, "Hello "+ PlayerName +", \n\n congratulation you have won the game. \n\n Total Moves:  "+Totalmoves+" \n Total Crates: 4"); 
            	System.exit(0);
            	
            	
        }
        this.repaint();
    }
    

	/**
	 * Modification of the paint method that correctly paints the 
	 * game board on the canvas with respect to the 2D array of the
	 * maze, scaled accordingly.
	 */
    
    public void paint(final Graphics g) {
        super.paint(g);
        if (!this.win) {
            for (int y = 0; y < 20; ++y) {
                for (int x = 0; x < 20; ++x) {
                    if (this.m.getMap(x, y).equals("D")) {
                        g.drawImage(this.m.getDiamond(), x * 32, y * 32, null);
                    }
                    if (this.m.getMap(x, y).equals("W")) {
                        g.drawImage(this.m.getWall(), x * 32, y * 32, null);
                    }
                    if (this.m.getMap(x, y).equals("O")) {
                    	 g.drawImage(this.m.getOuterwall(), x * 32, y * 32, null);
                    }
                    if (this.m.getMap(x, y).equals("R")) {
                   	 g.drawImage(this.m.getSpace(), x * 32, y * 32, null);
                   }
                }
                g.drawImage(this.p.getPlayer(), this.p.getTileX() * 32, this.p.getTileY() * 32, null);
                //System.out.println(this.b.getBox1());
                g.drawImage(this.b.getBox1(), this.b.getBox1TileX() * 32, this.b.getBox1TileY() * 32, null);
                g.drawImage(this.b.getBox2(), this.b.getBox2TileX() * 32, this.b.getBox2TileY() * 32, null);
                g.drawImage(this.b.getBox3(), this.b.getBox3TileX() * 32, this.b.getBox3TileY() * 32, null);
                g.drawImage(this.b.getBox4(), this.b.getBox4TileX() * 32, this.b.getBox4TileY() * 32, null);
               
            }

        }
    }
    
    public void keyReleased(final KeyEvent e) {
    }
    
    public void keyTyped(final KeyEvent e) {
    }
    /**
     * This param is used for defining directions for the player to move the Crates 
     * @param keycode
     */
    
    // There are 4 conditions for the Crates as for the game i have created 4 seperates movements 
    public void moveBox(final int keycode) {
        if(Board.this.b.getBox1TileX()==Board.this.p.getTileX() && Board.this.b.getBox1TileY()==Board.this.p.getTileY()) {        	
        	if(keycode==38 && !Board.this.m.getMap(Board.this.b.getBox1TileX(), Board.this.b.getBox1TileY() - 1).equals("W")) {
        		Board.this.b.moveBox1(0, -1); 
        	}
        	if(keycode==40 && !Board.this.m.getMap(Board.this.b.getBox1TileX(), Board.this.b.getBox1TileY() + 1).equals("W")) {
        		Board.this.b.moveBox1(0, 1);
        	}
        	if(keycode==37 && !Board.this.m.getMap(Board.this.b.getBox1TileX() - 1, Board.this.b.getBox1TileY()).equals("W")) {
        		Board.this.b.moveBox1(-1, 0); 
        	} 
        	if(keycode==39 && !Board.this.m.getMap(Board.this.b.getBox1TileX() + 1, Board.this.b.getBox1TileY()).equals("W")) {
        		Board.this.b.moveBox1(1, 0); 
        	}
          }               
        else if(Board.this.b.getBox2TileX()==Board.this.p.getTileX() && Board.this.b.getBox2TileY()==Board.this.p.getTileY()) {        	 
        	if(keycode==38 && !Board.this.m.getMap(Board.this.b.getBox2TileX(), Board.this.b.getBox2TileY() - 1).equals("W")) {
        		Board.this.b.moveBox2(0, -1); 
        	}
        	if(keycode==40 && !Board.this.m.getMap(Board.this.b.getBox2TileX(), Board.this.b.getBox2TileY() + 1).equals("W")) {
        		Board.this.b.moveBox2(0, 1);
        	}
        	if(keycode==37 && !Board.this.m.getMap(Board.this.b.getBox2TileX() - 1, Board.this.b.getBox2TileY()).equals("W")) {
        		Board.this.b.moveBox2(-1, 0); 
        	} 
        	if(keycode==39 && !Board.this.m.getMap(Board.this.b.getBox2TileX() + 1, Board.this.b.getBox2TileY()).equals("W")) {
        		Board.this.b.moveBox2(1, 0); 
        	}
          }      
        else if(Board.this.b.getBox3TileX()==Board.this.p.getTileX() && Board.this.b.getBox3TileY()==Board.this.p.getTileY()) {
        	if(keycode==38 && !Board.this.m.getMap(Board.this.b.getBox3TileX(), Board.this.b.getBox3TileY() - 1).equals("W")) {
        		Board.this.b.moveBox3(0, -1); 
        	}
        	if(keycode==40 && !Board.this.m.getMap(Board.this.b.getBox3TileX(), Board.this.b.getBox3TileY() + 1).equals("W")) {
        		Board.this.b.moveBox3(0, 1);
        	}
        	if(keycode==37 && !Board.this.m.getMap(Board.this.b.getBox3TileX() - 1, Board.this.b.getBox3TileY()).equals("W")) {
        		Board.this.b.moveBox3(-1, 0); 
        	}  
        	if(keycode==39 && !Board.this.m.getMap(Board.this.b.getBox3TileX() + 1, Board.this.b.getBox3TileY()).equals("W")) {
        		Board.this.b.moveBox3(1, 0); 
        	}      	
          }       
        else if(Board.this.b.getBox4TileX()==Board.this.p.getTileX() && Board.this.b.getBox4TileY()==Board.this.p.getTileY()) {
        	if(keycode==38 && !Board.this.m.getMap(Board.this.b.getBox4TileX(), Board.this.b.getBox4TileY() - 1).equals("W")) {
        		Board.this.b.moveBox4(0, -1); 
        	}
        	if(keycode==40 && !Board.this.m.getMap(Board.this.b.getBox4TileX(), Board.this.b.getBox4TileY() + 1).equals("W")) {
        		Board.this.b.moveBox4(0, 1);
        	}
        	if(keycode==37 && !Board.this.m.getMap(Board.this.b.getBox4TileX() - 1, Board.this.b.getBox4TileY()).equals("W")) {
        		Board.this.b.moveBox4(-1, 0); 
        	}  
        	if(keycode==39 && !Board.this.m.getMap(Board.this.b.getBox4TileX() + 1, Board.this.b.getBox4TileY()).equals("W")) {
        		Board.this.b.moveBox4(1, 0); 
        	}
          }
    }
    
    public class Al extends KeyAdapter
    {
        @Override
        /**
         * This is an override function for the direction for the player
         * controls  are arrows 
         */
        public void keyPressed(final KeyEvent e) {
            final int keycode = e.getKeyCode();
            if (keycode == 38 && !Board.this.m.getMap(Board.this.p.getTileX(), Board.this.p.getTileY() - 1).equals("W")  && 
            		!Board.this.m.getMap(Board.this.p.getTileX(), Board.this.p.getTileY() - 1).equals("D")  
            	) 
            {
                Board.this.p.move(0, -1);    
                moveBox(keycode);
            }
            else if (keycode == 40 && !Board.this.m.getMap(Board.this.p.getTileX(), Board.this.p.getTileY() + 1).equals("W") && 
            			!Board.this.m.getMap(Board.this.p.getTileX(), Board.this.p.getTileY() + 1).equals("D")  
            		) 
            {
                Board.this.p.move(0, 1);      
                moveBox(keycode);    
            }
            else if (keycode == 37 && !Board.this.m.getMap(Board.this.p.getTileX() - 1, Board.this.p.getTileY()).equals("W") && 
            			!Board.this.m.getMap(Board.this.p.getTileX() - 1, Board.this.p.getTileY()).equals("D")
            		) 
            {
                Board.this.p.move(-1, 0);    
                moveBox(keycode);
            }
            else if (keycode == 39 && !Board.this.m.getMap(Board.this.p.getTileX() + 1, Board.this.p.getTileY()).equals("W") && 
            			!Board.this.m.getMap(Board.this.p.getTileX() + 1, Board.this.p.getTileY()).equals("D")
            		) 
            {
                Board.this.p.move(1, 0);   
                moveBox(keycode);
            }    
            Totalmoves++;
        }
    }
}
