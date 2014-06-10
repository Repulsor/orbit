package orbit;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;

import orbit.Entity;

@SuppressWarnings("unused")
public class Simulation implements KeyListener, MouseListener {
	
	public LinkedList<Entity> object = new LinkedList<Entity>();
	
	private Entity tempObject;
	
	private boolean go = true;
	private int num = 0;
	
	public static boolean[] keys = new boolean[1024];
	
	public Simulation() {
		
	}
	
	public void addObject(Entity e) {
		this.object.add(e);
		num++;
	}
	
	public void removeObject(Entity e) {
		this.object.remove(e);
		num--;
	}
	
	public void update(float tslf) {
		if(go) {
			for(int i = 0; i < object.size(); i++) {
				tempObject = object.get(i);
				tempObject.update(object, tslf);
				
			}
		}
	}	
	
	public void draw(Graphics g) {
		for(int i = 0; i < object.size(); i++) {
			tempObject = object.get(i);
			tempObject.draw(g);
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
