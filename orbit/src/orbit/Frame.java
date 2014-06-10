package orbit;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.UIManager;

import orbit.*;

@SuppressWarnings("unused")
public class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4992163186225466629L;
	
	private BufferStrategy bs;
	private Random rand;
	private Simulation simu;
	private float tslu;
	private float PAUSETIME = 0.001f;
	
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
		
		rand = new Random();
		simu = new Simulation();
		
		addKeyListener(simu);
		addMouseListener(simu);
		
		Particle p1 = new Particle(250, 250, 15, EntityObjectID.Particle);
		simu.addObject(p1);
	}

	public void update(float tslf) {		
		tslu += tslf;
		if(tslu > PAUSETIME) {
			simu.update(tslf);
			tslu = 0;
		}
	}

	public void repaint() {
		Graphics g = bs.getDrawGraphics();
		draw(g);
		g.dispose();
		bs.show();
	}
	
	private void createBackground(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Main.width, Main.height);
	}
	
	public void draw(Graphics g) {
		createBackground(g);
		simu.draw(g);
	}
}
