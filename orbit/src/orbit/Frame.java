package orbit;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.UIManager;

import orbit.data.Particle;
import orbit.object.EntityObjectID;

public class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4992163186225466629L;
	
	private BufferStrategy bs;
	private Simulation simu;
	   
	private float tslu;
	private float pauseTime = 0.001f;
	
	public Frame(String title) {
		setTitle(title);		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	public void init() {
		createBufferStrategy(3);
		bs = getBufferStrategy();
		
		simu = new Simulation();
		
		addKeyListener(simu);
		addMouseListener(simu);
		
		Particle p1 = new Particle(250, 250, EntityObjectID.Particle);
		Particle p2 = new Particle(350, 250, EntityObjectID.Particle);
		simu.addObject(p2);
		simu.addObject(p1);
	}

	public void update(float tslf) {
		tslu += tslf;
		if(tslu > pauseTime) {
			simu.update(tslf);
			tslu = 0;
		}
	}
	
	private void createBackground(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Main.width, Main.height);
	}
	
	public void draw(Graphics g) {
		createBackground(g);
		simu.draw(g);
	}

	public void repaint() {
		Graphics g = bs.getDrawGraphics();
		draw(g);
		g.dispose();
		bs.show();
	}
}
