package orbit.model;


import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;


public abstract class Entity {
	
	protected EntityObjectID id;
	protected Color color;
	
	protected Position position;
	protected Velocity velocity;
	
	//Position
	protected double posX = 0;
	protected double posY = 0;
	
	//Velocity
	protected double speedX = 0;
	protected double speedY = 0;
	
	//Time and Delta-Time
	protected double t = 0;
	protected double dt = 0.1;

	protected double radius = 1;
	
	protected double acceleration = 1;
	
	protected double energy = 0;
	protected double energyLoss = 0.65f;
	
	protected double mass = 1;
	protected double force = 1;
	
	
	public Entity(double x, double y, double z, double vx, double vy, double vz, EntityObjectID id) {
		position = new Position(x, y, z);
		velocity = new Velocity(vx, vy, vz);
		this.id = id;
	}
	
	
	public Entity(double x, double y, double vx, double vy, EntityObjectID id) {
		posX = x;
		posY = y;
		speedX = vx;
		speedY = vy;
		this.id = id;
	}
	
		
	public abstract void update(LinkedList<Entity> object, float delta);

	public abstract void draw(Graphics g);
}
