package orbit;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.UIManager;

import orbit.model.EntityObjectID;
import orbit.objects.Particle;

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
		
		Random random = new Random();
		simu = new Simulation();
		
		addKeyListener(simu);
		addMouseListener(simu);

		Particle p1 = new Particle(random.nextInt(Main.width -100), random.nextInt(Main.height - 100), random.nextInt(20), random.nextInt(20), EntityObjectID.Particle);
		Particle p2 = new Particle(350, 250, 0, 0, EntityObjectID.Particle);
		Particle p3 = new Particle(50, 85, 0, 0, EntityObjectID.Particle);
		Particle p4 = new Particle(100, 145, 0, 0, EntityObjectID.Particle);
		
		simu.addObject(p4);
		simu.addObject(p3);
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
