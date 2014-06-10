package orbit;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;


public class Particle extends Entity {

	public Particle(float posX, float posY, float mass, EntityObjectID id) {
		super(posX, posY, mass, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(LinkedList<Entity> object, float tslf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillOval((int)posX, (int)posY, (int)radius, (int)radius);
	}
}
