package orbit;

import orbit.Frame;

public class Main {

	public static int width = 800;
	public static int height = 600;
	
	public static void main(String[] args) {
		Frame f = new Frame("N-Body Physics Simulation");
		
		f.setResizable(false);
		f.setSize(width, height);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
		
		f.init();
		
		long lastFrame = System.currentTimeMillis();
		
		while(true) {
			long currentFrame = System.currentTimeMillis();
			float tslf = (float) ((currentFrame - lastFrame)/1000.0);
			lastFrame = currentFrame;
			
			f.update(tslf);
			f.repaint();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
