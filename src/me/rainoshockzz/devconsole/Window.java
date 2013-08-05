package me.rainoshockzz.devconsole;

import java.awt.Button;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	public Window() {
		super(DevConsole.NAME);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea console = new TextArea();
		console.setEditable(false);
		console.setBounds(10, 10, 600, 552);
		contentPane.add(console);
		
		Button aboutBtn = new Button("About");
		aboutBtn.setBounds(741, 540, 43, 22);
		aboutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "DevConsole is an external developer console for Minecraft 1.6.0 and higher." +
						"\n" +
						"With more features than the normal developer console built into the new Minecraft launcher." +
						"\n\n" +
						"Coded by RainoBoy97 and XX_iiShockzz_XX",
						"DevConsole",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		contentPane.add(aboutBtn);
	}
}
