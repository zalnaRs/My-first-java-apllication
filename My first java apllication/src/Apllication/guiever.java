package Apllication;

import javax.swing.JFrame;

public class guiever extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Apllication");
		
		frame.setBounds(0, 0, 480, 360);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Guimain());
		frame.setVisible(true);
	}
}
