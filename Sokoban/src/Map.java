import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.util.HashMap;
import java.util.Scanner;


/**
 * A Map class that generates a full game map represented by
 * a 2D array of characters.
 */
public class Map
{

/**
 * The variables are used for storing values such as image icons used in the map 
 */
    private Scanner m;
    private String[] Map;
    private String ImgLocation []= {"C:\\Users\\Reaper\\eclipse-workspace\\Sokoban\\img\\brick.png","C:\\Users\\Reaper\\eclipse-workspace\\Sokoban\\img\\Grass.png","C:\\Users\\Reaper\\eclipse-workspace\\Sokoban\\img\\diamond.png","C:\\Users\\Reaper\\eclipse-workspace\\Sokoban\\img\\Blue.png"};
    private HashMap<String,ImageIcon> hashImage;
    private Image wall,Space,Diamond,Outerwall;
    private ImageIcon icon[] = new ImageIcon[4];
    
    /**
     * The map method is used for using the created 
     * @param lvl
     */
    public Map(final int lvl)
    {
    	/**
    	 * Using Hasmap for Implementing Image icons for prebuffering
    	 */
    	hashImage= new HashMap <String,ImageIcon>();
    	for (int i = 0; i<4;i++)
    	{
    		icon[i] = (ImageIcon) getImage(ImgLocation[i]);
    	}
    	
        this.Map = new String[20];
        
       this.wall = icon[0].getImage();
       
		 this.Space = icon[1].getImage();

        this.Diamond = icon[2].getImage();
        

        this.Outerwall = icon[3].getImage();
        
        this.openFile(lvl);
        this.readFile();
        this.closeFile();
    }

	
	private ImageIcon getImage(String ImgLocation) {
		if (hashImage.containsKey(ImgLocation)==true)
		{
			return hashImage.get(ImgLocation);
		}
		else 
		{
			ImageIcon myimg = new ImageIcon(ImgLocation);
			hashImage.put(ImgLocation,myimg);
			return myimg;
		}
		
	}


	public Image getSpace() {
	  return this.Space;
	}
	 
    
    public Image getWall() {
        return this.wall;
    }
       
    public Image getDiamond() {
        return this.Diamond;
    }
    
    public Image getOuterwall() {
        return this.Outerwall;
    }
    
    public String getMap(final int x, final int y) {
    	
        final String index = this.Map[y].substring(x, x + 1);
        return index;
    }
    
    /**
     * The openfile is used to read the map txt 
     * @param lvl
     */
    
    public void openFile(final int lvl) {
        try {
        	String filename = ("C:\\Users\\Reaper\\eclipse-workspace\\Sokoban\\src\\Map"+lvl+".txt");     	
            this.m = new Scanner(new File(filename));          
        }
        catch (Exception e) {
            System.out.println("error loading map");
        }
    }
    
    public void readFile() {
        while (this.m.hasNext()) {
            for (int i = 0; i < 20; ++i) {
                this.Map[i] = this.m.next();
            }
        }
    }
    
    public void closeFile() {
        this.m.close();
    }
}
