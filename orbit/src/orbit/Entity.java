package orbit;


import java.awt.Graphics;
import java.util.LinkedList;

import orbit.EntityObjectID;


public abstract class Entity {
	
	protected EntityObjectID id;
	
	protected float radius = 5;
	protected float mass = 1;
	protected float accel = 0;
	
	protected float posX = 0;
	protected float posY = 0;
	
	protected float speedX = 0;
	protected float speedY = 0;

	public Entity(float posX, float posY, float speedX, float speedY, float accel, float mass, float radius, EntityObjectID id) {
		this.posX = posX;
		this.posY = posY;
		this.speedX = speedX;
		this.speedY = speedY;
		this.accel = accel;
		this.mass = mass;
		this.radius = radius;
		this.id = id;
	}
	
	public Entity(float posX, float posY, float speedX, float speedY, float mass, float radius, EntityObjectID id) {
		this.posX = posX;
		this.posY = posY;
		this.speedX = speedX;
		this.speedY = speedY;
		this.mass = mass;
		this.radius = radius;
		this.id = id;
	}
	
	public Entity(float posX, float posY, float speedX, float speedY, float mass, EntityObjectID id) {
		this.posX = posX;
		this.posY = posY;
		this.speedX = speedX;
		this.speedY = speedY;
		this.mass = mass;
		this.id = id;
	}
	
	public Entity(float posX, float posY, float mass, EntityObjectID id) {
		this.posX = posX;
		this.posY = posY;
		this.mass = mass;
		this.id = id;
	}
	
	public Entity(float posX, float posY, EntityObjectID id) {
		this.posX = posX;
		this.posY = posY;
		this.id = id;
	}
	
	public abstract void update(LinkedList<Entity> object, float tslf);

	public abstract void draw(Graphics g);
	
}
