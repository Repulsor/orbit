package orbit.objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

import orbit.model.Entity;
import orbit.model.EntityObjectID;



public class Node extends Entity {

	
	public Node(double x, double y, double z, EntityObjectID id) {
		super(x, y, z, id);
		this.w = 20;
		this.h = 20;
	}
	
	public Node(double x, double y, EntityObjectID id) {
		this(x, y, 0, id);
		this.w = 20;
		this.h = 20;
	}

	@Override
	public void update(LinkedList<Entity> object, float delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillOval((int)position.getX(), (int)position.getY(), (int)w, (int)h);
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}
}
