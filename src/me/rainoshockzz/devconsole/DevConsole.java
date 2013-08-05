package me.rainoshockzz.devconsole;

import java.awt.Dimension;

import javax.swing.SwingUtilities;

/** DevConsole - Developed by RainoBoy97 and XX_iiShockzz_XX **/

public class DevConsole {

	public static final String NAME = "DevConsole";

	public static final Dimension CONSOLE_SIZE = new Dimension(700, 500);

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
