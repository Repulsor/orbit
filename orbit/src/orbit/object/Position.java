package orbit.object;


public class Position {

	private double x = 0;
	private double y = 0;
	private double z = 0;
	
	
	public Position(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	public Position(double x, double y) {
		this(x, y, 0.0);
	}
	
	
	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setXYZ(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	public double getX() {
		return x;
	}

	
	public double getY() {
		return y;
	}
	
	
	public double getZ() {
		return z;
	}

	
	public void setX(double x) {
		this.x = x;
	}

	
	public void setY(double y) {
		this.y = y;
	}

	
	public void setZ(double z) {
		this.z = z;
	}
}
