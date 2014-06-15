package orbit.objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

import orbit.model.Entity;
import orbit.model.EntityObjectID;


public class Rope extends Entity {

	private int[] xPoints;
	private int[] yPoints;
	private int nPoints;
	
	
	public Rope(double x, double y, double vx, double vy, EntityObjectID id) {
		super(x, y, vx, vy, id);
		nPoints = 50;
		xPoints = new int[nPoints];
		yPoints = new int[nPoints];
		for(int i=0; i < nPoints; i++) {
			int fx = i*i;
			xPoints[i] = i;
			yPoints[i] = fx;
		}
	}

	@Override
	public void update(LinkedList<Entity> object, float delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GRAY);
		g.drawPolyline(xPoints, yPoints, nPoints);
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

}
