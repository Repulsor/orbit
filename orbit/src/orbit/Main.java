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
		
		f.requestFocus();
		
		long lastFrameTime = System.currentTimeMillis();
		int targetFrameRate = 60;
		float tslf;
		
		while(true) {
			
			long currentFrameTime = System.currentTimeMillis();
			tslf = (float) ((currentFrameTime - lastFrameTime)/1000.0);
			lastFrameTime = currentFrameTime;
			
			f.update(tslf);
			f.repaint();
			
			try {
				Thread.sleep(1000/targetFrameRate);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
