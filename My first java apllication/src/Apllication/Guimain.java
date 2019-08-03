package Apllication;

import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Guimain extends JPanel {
	private static final BufferedImage logo = loadTexture("logo.jpg");
	
		

		public Guimain() {
			setLayout(null);
			
			JButton button0 = new JButton("button0");
			JButton button1 = new JButton("button1");
			
			button0.setBounds(20, 20, 120, 20);
			button1.setBounds(150, 20, 120, 20);
			
			button0.addActionListener(e ->JOptionPane.showMessageDialog(this,"You pressed button."));
			button1.addActionListener(e ->JOptionPane.showMessageDialog(this,"You pressed button."));
		
			add(button0);
			add(button1);	
			
			System.out.println("elindult");
		}
		private static BufferedImage loadTexture(String name) {
			try {
				return ImageIO.read(Guimain.class.getResource("/texture/" + name));
			} catch (IOException e) {
				System.err.println("Can't load texture: " + name);
				return null;
			}
		}
		@Override
		protected void paintComponent(Graphics graphics) {
			super.paintComponent(graphics);
			graphics.drawImage(logo, 20, 50, 128, 128, null);
		}
}

