package orbit.properties;


public class Velocity {

	private double speedX = 0;
	private double speedY = 0;
	private double speedZ = 0;
	
	
	public Velocity(double vx, double vy, double vz) {
		speedX = vx;
		speedY = vy;
		speedZ = vz;
	}
	
	
	public Velocity(double vx, double vy) {
		this(vx, vy, 0.0);
	}
	
	
	public void setSpeedXY(double vx, double vy) {
		speedX = vx;
		speedY = vy;
	}
	
	public void setSpeedXYZ(double vx, double vy, double vz) {
		speedX = vx;
		speedY = vy;
		speedZ = vz;
	}

	
	public double getSpeedX() {
		return speedX;
	}

	
	public double getSpeedY() {
		return speedY;
	}

	
	public double getSpeedZ() {
		return speedZ;
	}

	
	public void setSpeedX(double speedX) {
		this.speedX = speedX;
	}

	
	public void setSpeedY(double speedY) {
		this.speedY = speedY;
	}

	
	public void setSpeedZ(double speedZ) {
		this.speedZ = speedZ;
	}
}
