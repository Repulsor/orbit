package orbit.object;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;

import orbit.Main;
import orbit.model.Entity;
import orbit.model.EntityObjectID;
import orbit.physic.PhysicEngine;


public class Particle extends Entity {

	private Random rand;
	
	protected double gravity = PhysicEngine.g;
	protected double xFriction = 0.89;
	protected double yFriction = 0.99;
	
	public Particle(float posX, float posY, EntityObjectID id) {
		super(posX, posY, 0, 0, id);
		this.speedX = -2;
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
		if(posX + radius > Main.width) {
			posX = Main.width - radius;
			speedX = -speedX;
		} else if(posX < 0) {
			posX = 0;
			speedX = -speedX;
		} else {
			posX += speedX;
		}
        
        //stops infinity rolling on the ground
		if(posY + radius == Main.height) {
			speedX *= xFriction;
			if(Math.abs(speedX) < 0.86) {
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
			posY += speedY * dt + 0.5 * gravity * dt * dt;
		}
		
		t += dt;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval((int)posX, (int)posY, (int)radius, (int)radius);
	}
}
