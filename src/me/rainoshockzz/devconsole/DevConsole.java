package me.rainoshockzz.devconsole;

import javax.swing.JFrame;

/** DevConsole - Developed by RainoBoy97 and XX_iiShockzz_XX **/

public class DevConsole extends JFrame {

	private static final long serialVersionUID = 1L;

	private static void createFrame() {
		JFrame frame = new JFrame("DevConsole");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		createFrame();
	}

}