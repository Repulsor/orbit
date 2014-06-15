package orbit.objects;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

import orbit.model.Entity;
import orbit.model.EntityObjectID;
import orbit.properties.Position;



public class Node extends Entity {

	Position position;
	
	
	public Node(double x, double y, double z, EntityObjectID id) {
		super(x, y, z, id);
	}
	
	public Node(double x, double y, EntityObjectID id) {
		this(x, y, 0, id);
	}

	@Override
	public void update(LinkedList<Entity> object, float delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}
}
