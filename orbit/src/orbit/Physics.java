package orbit;

import orbit.properties.Position;


public abstract class Physics {
	/*
	 * ELECTROMAGNETISM
	 */
	//speed of light
	public final static double c = 299792458;
	
	//elementary charge
	public final static double e = 1.602176565;
	
	//electrical field
	public final static double ef = 8.85418781762038985;
	
	//coulomb constant
	public final static double k = 8987551787.3681764;
	
	//von-Klitzing constant
	public final static double R = 25812.8074434;
	
	/*
	 * GRAVITATION
	 */
	//gravitational constant
	public final static double G = 6.67384;
	
	//standard gravitation - earth gravity
	public final static double g =  9.80665;
	
	public double distance(Position p1, Position p2) {
		return Math.sqrt(
				(p1.getX() - p2.getX()) *  (p1.getX() - p2.getX()) + 
				(p1.getY() - p2.getY()) *  (p1.getY() - p2.getY())
				);
	}
	
	public Position midpoint(Position p1, Position p2) {
	    return new Position((p1.getX() + p2.getX()) / 2, (p1.getY() + p2.getY()) / 2);
	}
}
