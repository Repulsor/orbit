package orbit;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;


public class Particle extends Entity {

	public Particle(float posX, float posY, float mass, EntityObjectID id) {
		super(posX, posY, mass, id);
		this.speedX = 0;
		this.speedY = 5;
		this.accel = 50;
		this.radius = 20;
	}

	@Override
	public void update(LinkedList<Entity> object, float tslf) {
		this.addGravity(tslf);
		this.addBounds();
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillOval((int)posX, (int)posY, (int)radius, (int)radius);
	}
}
