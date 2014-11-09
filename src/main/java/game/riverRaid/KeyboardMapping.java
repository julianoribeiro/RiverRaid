package game.riverRaid;

import java.awt.event.KeyEvent;

public class KeyboardMapping {

	public String keyPressed(KeyEvent e) {
	    int keyCode = e.getKeyCode();
	    switch( keyCode ) { 
	        case KeyEvent.VK_UP:
	            System.out.println("up");
	            return "up";
	        case KeyEvent.VK_DOWN:
	            // handle down 
	        	System.out.println("down");
	        	return "down";
	        case KeyEvent.VK_LEFT:
	            // handle left
	        	System.out.println("left");
	        	return "left";
	        case KeyEvent.VK_RIGHT :
	            // handle right
	        	System.out.println("right");
	        	return "right";
	     }
	    
	    return "";
	} 
}
