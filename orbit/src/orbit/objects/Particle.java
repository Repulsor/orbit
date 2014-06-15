package orbit.objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;
import java.util.Random;

import orbit.Main;
import orbit.Physics;
import orbit.model.Entity;
import orbit.model.EntityObjectID;

@SuppressWarnings("unused")
public class Particle extends Entity {

	private Random rand;
	
	public Particle(double x, double y, double vx, double vy, EntityObjectID id) {
		super(x, y, vx, 20, id);
		this.w = 20;
		this.h = 20;
		rand = new Random();
		randomColor();
	}
	
	public void randomColor() {
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		color = new Color(r, g, b);
	}

	@Override
	public void update(LinkedList<Entity> object, float delta) {
		setPosY(getPosY() + getSpeedY());
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval((int)getPosX(), (int)getPosY(), (int)w, (int)h);
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle((int)getPosX(), (int)getPosY(), (int)w, (int)h);
	}
}
