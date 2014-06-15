package orbit.model;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

import orbit.Physics;
import orbit.properties.Position;
import orbit.properties.Velocity;


public abstract class Entity extends Physics {
	
	protected EntityObjectID id;
	protected Color color;
	
	protected Position position;
	protected Velocity velocity;
	
	protected double w = 0;
	protected double h = 0;
	
	
	public Entity(double x, double y, double z, double vx, double vy, double vz, EntityObjectID id) {
		position = new Position(x, y, z);
		velocity = new Velocity(vx, vy, vz);
		this.id = id;
	}
	
	public Entity(double x, double y, double vx, double vy, EntityObjectID id) {
		this(x, y, 0, vx, vy, 0, id);
	}
	
	public Entity(double x, double y, double z, EntityObjectID id) {
		this(x, y, z, 0, 0, 0, id);
	}
	
	public Entity(double x, double y, EntityObjectID id) {
		this(x, y, 0, 0, 0, 0, id);
	}
	
	
	public abstract void update(LinkedList<Entity> object, float delta);

	public abstract void draw(Graphics g);
	
	public abstract Rectangle getBounds();

	public double getPosX() {
		return position.getX();
	}

	public double getPosY() {
		return position.getY();
	}
	
	public double getSpeedX() {
		return velocity.getSpeedX();
	}

	public double getSpeedY() {
		return velocity.getSpeedY();
	}

	public void setPosX(double posX) {
		position.setX(posX);
	}

	public void setPosY(double posY) {
		position.setY(posY);
	}
	
	public void setSpeedX(double speedX) {
		velocity.setSpeedX(speedX);
	}

	public void setSpeedY(double speedY) {
		velocity.setSpeedY(speedY);
	}
	
	public double getRadiusX() {
		return w;
	}
	
	public double getRadiusY() {
		return h;
	}

	public void setRadiusX(double radius) {
		this.w = radius;
	}
	
	public void setRadiusY(double radius) {
		this.h = radius;
	}
}
