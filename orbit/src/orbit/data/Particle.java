package orbit.data;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;

import orbit.Main;
import orbit.object.Entity;
import orbit.object.EntityObjectID;


public class Particle extends Entity {

	private Random rand;
	
	protected double gravity = 9.8f;
	protected double xFriction = 0.89;
	protected double yFriction = 0.99;
	
	public Particle(float posX, float posY, EntityObjectID id) {
		super(posX, posY, 0, 0, id);
		this.speedX = 6;
		this.speedY = 2;
		this.radius = 20;
		this.force = 10;
		this.mass = 10;
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
		if(posX + radius + speedX > Main.width) {
			posX = Main.width - radius;
			speedX = -speedX;
		} else if(posX + speedX < 0 + radius) {
			posX = 0 + radius;
			speedX = -speedX;
		} else {
			posX += speedX;
		}
        
		if(posY + radius == Main.height) {
			speedX *= xFriction;
			if(Math.abs(speedX) < .8) {
				speedX = 0;
			}
		}
		
		if(posY + radius > Main.height) {
			posY = Main.height - radius;
			speedY *= energyLoss;
			speedY = -speedY;
		} else if(posY - radius < 0) {
			posY = radius;
		} else {
			//Velocity
			speedY += gravity * dt;
			
			//Position
			posY += speedY * dt + .5 * gravity * dt * dt;
		}
		
		t += dt;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval((int)posX, (int)posY, (int)radius, (int)radius);
	}
}
